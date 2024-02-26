package InheritanceExam.Question1;

public class Motorcycle extends Vehicles{
    @Override
    void start() {
        System.out.println("Starting Motorcycle...");
    }

    @Override
    void accelerate() {
        System.out.println("accelarating motorcycle");
    }

    @Override
    void brake() {
        System.out.println("applying brakes on motorcycle");
    }
}
