package Interface;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose service Provider ");
        System.out.println("1:Air India Express\n2:Spice Jet");
        int choice= sc.nextInt();

        Goibibo g1=null;
        if (choice==1){
            g1=new AirIndiaExpress();
            g1.getServiceProvider();
        } else if (choice==2) {
            g1=new SpiceJet();
            g1.getServiceProvider();
        }else {
            System.out.println("Invalid Choice");
        }

        if (g1!=null){
            System.out.print("Enter No of quantity :");
            int qty= sc.nextInt();
            g1.bookTicket(qty);
        }

    }
}
