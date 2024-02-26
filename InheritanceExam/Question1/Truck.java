package InheritanceExam.Question1;

public class Truck extends Vehicles{
    @Override
    void start() {
        System.out.println("Starting Truck...");
    }

    @Override
    void accelerate() {
        System.out.println("applying acceleration(truck)...");
    }

    @Override
    void brake() {
        System.out.println("Applying Brakes (truck)...");
    }
}
