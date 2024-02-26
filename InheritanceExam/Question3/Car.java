package InheritanceExam.Question3;

public class Car extends Vehicle{

    @Override
    void starting() {
        System.out.println("Starting Car");
    }

    @Override
    void stopping() {
        System.out.println("stopping the car");
    }
    void accelarate(){
        System.out.println("accelarating the car ");
    }

}
