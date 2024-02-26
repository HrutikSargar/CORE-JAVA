package InheritanceExam.Question3;

import java.sql.SQLOutput;

public class Motorcycle extends Vehicle {

    @Override
    void starting() {
        System.out.println("Starting The Motorcycle ");
    }

    @Override
    void stopping() {
        System.out.println("Stopping the Motorcycle");
    }
    void performWheelie(){
        System.out.println("Performing the wheelie");
    }
}
