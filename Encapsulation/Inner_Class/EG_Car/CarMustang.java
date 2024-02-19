package Encapsulation.Inner_Class.EG_Car;

public class CarMustang {
    class Engine{
        String name="Turbo V8";
        void DisplayName(){
            System.out.println("Engine Name is "+name);
        }
    }
    static class Gears{
        int totalGears=6;
        void displayInfo(){
            System.out.println("This car has "+totalGears+" gears");
        }
    }


}
