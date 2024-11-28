public class Sample4_5 {
    public static void main(String[] args) {
        Car car1 = new RacingCar();
        
        car1.setCar(1234,20.5);
        
        car1.Show(); 
    }
}

class Car {
    protected int num;       // 保護成員變數
    protected double gas;    // 保護成員變數

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了一輛車");
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
        System.out.println("生產了一輛賽車");
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
