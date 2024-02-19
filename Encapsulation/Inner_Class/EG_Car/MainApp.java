package Encapsulation.Inner_Class.EG_Car;

public class MainApp {
    public static void main(String[] args) {
        CarMustang c1=new CarMustang();

        //Static inner class
        CarMustang.Gears g1=new CarMustang.Gears();
        g1.displayInfo();

        //Non-Static inner class
        CarMustang.Engine e1=c1.new Engine();
        e1.DisplayName();

    }
}
