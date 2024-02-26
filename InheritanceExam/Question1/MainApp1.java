package InheritanceExam.Question1;

public class MainApp1 {
    public static void main(String[] args) {
        Vehicles v1=new Car();
        v1.start();
        v1.accelerate();
        v1.brake();

        Vehicles v2=new Motorcycle();
        v2.start();
        v2.accelerate();
        v2.brake();

        Vehicles v3=new Truck();
        v3.start();
        v3.accelerate();
        v3.brake();
    }

}
