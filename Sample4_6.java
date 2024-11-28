public class Sample4_6 {
    public static void main(String[] args) {
    	 Car cars[] = new Car[2]; // 宣告 Car 型別的陣列
    	 
         cars[0] = new Car();
         cars[0].setCar(1234, 20.5);
  
         cars[1] = new Car();
         cars[1].setCar(4567, 30.5);
  
         for (int i = 0; i < cars.length; i++) {
             cars[i].show(); // 修正陣列名稱為 cars
         }
    }
}

class Car {
    protected int num;       // 保護成員變數
    protected double gas;    // 保護成員變數
 
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
 
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
    }
 
    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}
 
class RacingCar extends Car {
    private int course;  // 子類別新增的成員變數
 
    public RacingCar() {
        course = 0;
        System.out.println("生產了賽車");
    }
 
    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為 " + course);
    }
 
    @Override
    public void show() {  // 覆寫父類別的 show 方法
        System.out.println("賽車的車號是 " + num);  // 使用父類別的保護成員
        System.out.println("汽油量是 " + gas);     // 使用父類別的保護成員
        System.out.println("賽車編號是 " + course);
    }
}