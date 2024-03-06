package Upcasting.OlaProblem;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter choice");
        System.out.println("1 : Auto\n2 : Cab");
        int choice = sc.nextInt();

        Ola o1=null;
        if (choice==1){
            o1=new Auto();
        } else if (choice==2) {
            o1=new Cab();
        }else {
            System.out.println("Invalid choice");
        }

        if (o1!=null){
            System.out.println("Enter Km");
            int km= sc.nextInt();
            o1.getServicetype();
            o1.getServiceCharges(km);
        }


    }
}
