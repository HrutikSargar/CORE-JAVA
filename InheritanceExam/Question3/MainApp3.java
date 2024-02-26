package InheritanceExam.Question3;

public class MainApp3 {
    public static void main(String[] args) {
        //upcasting
        Vehicle v1=new Car();
        Vehicle v2=new Motorcycle();

        //downcasting
        Car c1=(Car) v1;
        Motorcycle m1=(Motorcycle) v2;

        c1.starting();
        c1.stopping();
        c1.accelarate();

        System.out.println("=======================");

        m1.starting();
        m1.stopping();
        m1.performWheelie();

    }
}
