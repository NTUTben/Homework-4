public class Sample4_11 {
    public static void main(String[] args) {
    	 Vehicle[] vc = new Vehicle[2];
    	 
         vc[0] = new Car(1234, 20.5);
         vc[1] = new Plane(232);
  
         for (int i = 0; i < vc.length; i++) {
             if (vc[i] instanceof Car) { // 使用 instanceof 檢查物件類型
                 System.out.println("第" + (i + 1) + "個物件是 Car 類別");
             } else {
                 System.out.println("第" + (i + 1) + "個物件不是 Car 類別");
             }
         }
    }
}

abstract class Vehicle {
    protected int speed;
 
    public void setSpeed(int s) {
        speed = s;
        System.out.println("將速度設為 " + speed + "了");
    }
 
    abstract void show();
}
 
class Car extends Vehicle {
    private int num;
    private double gas;
 
    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("產生了車號為 " + num + "，汽油量為 " + gas + " 的車子");
    }
 
    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
        System.out.println("速度是 " + speed);
    }
}
 
class Plane extends Vehicle {
    private int flight;
 
    public Plane(int f) {
        flight = f;
        System.out.println("產生了班次為 " + flight + " 的飛機");
    }
 
    public void show() {
        System.out.println("飛機的班次是 " + flight);
        System.out.println("速度是 " + speed);
    }
}