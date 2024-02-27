package Interface;

public class AirIndiaExpress implements Goibibo{

    @Override
    public void getServiceProvider() {
        System.out.println("Welcome To Air india Express...");
    }

    @Override
    public void bookTicket(int qty) {
        double total =qty*5523;
        double finalTotal=total-189;
        System.out.println("Final Amount "+finalTotal);
    }
}
