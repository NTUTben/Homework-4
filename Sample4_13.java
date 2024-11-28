public class Sample4_13 {
    public static void main(String[] args) {
    	Car car1 = new Car(1234,20.5);
    	car1.vShow();
    	car1.mShow();
    }
}

interface iVehicle {
    void vShow(); // 定義 iVehicle 的抽象方法
}

interface iMaterial {
    void mShow(); // 定義 iMaterial 的抽象方法
}

class Car implements iVehicle, iMaterial {
    private int num;
    private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為 " + num + "，汽油量為 " + gas + "的車子");
    }

    public void vShow() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }

    public void mShow() {
        System.out.println("車子的材質是鐵");
    }
}
