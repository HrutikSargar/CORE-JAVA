package Interface;

public class SpiceJet implements Goibibo{
    @Override
    public void getServiceProvider() {
        System.out.println("Welcome to Spice Jet");
    }
    @Override
    public void bookTicket(int qty) {
        double total = qty*8588;
        double finalTotal=total-189;
        System.out.println("Final amount "+finalTotal);
    }
}
