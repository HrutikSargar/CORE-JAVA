package InheritanceExam.Question1;
public class Car extends Vehicles{
    @Override
    void start() {
        System.out.println("Car is Starting");
    }
    @Override
    void accelerate() {
        System.out.println("Car has an accelaration ");
    }
    @Override
    void brake() {
        System.out.println("applying brake on car...");
    }
}
