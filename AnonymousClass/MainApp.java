package AnonymousClass;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Paytm p1=new Paytm() {
            @Override
            public void getTelecomServiceProvider(String name) {
                System.out.println("Service Provider Name is "+name);
            }
            @Override
            public void makeReacharge(double amt) {
                System.out.println("Recharge successfull of amt "+amt);
            }
        };
        System.out.println("Service Provider Name is ");
        String name= sc.next();
        System.out.println("Recharge amt is ");
        int  amt= sc.nextInt();

        p1.getTelecomServiceProvider(name);
        p1.makeReacharge(amt);

        Paytm p2=new Paytm() {
            @Override
            public void getTelecomServiceProvider(String name) {
                System.out.println("Service Provider Name is "+name);
            }

            @Override
            public void makeReacharge(double amt) {
                System.out.println("Recharge successfull of amt "+amt);
            }
        };

        p2.getTelecomServiceProvider("Jio");
        p2.makeReacharge(399);

        Paytm p3=new Paytm() {
            @Override
            public void getTelecomServiceProvider(String name) {
                System.out.println("Service Provider Name is "+name);
            }

            @Override
            public void makeReacharge(double amt) {
                System.out.println("Recharge successfull of amt "+amt);
            }
        };

        p3.getTelecomServiceProvider("VI");
        p3.makeReacharge(550);

        Paytm p4=new Paytm() {
            @Override
            public void getTelecomServiceProvider(String name) {
                System.out.println("Service Provider Name is "+name);
            }

            @Override
            public void makeReacharge(double amt) {
                System.out.println("Recharge successfull of amt "+amt);
            }
        };

        p4.getTelecomServiceProvider("BSNL");
        p4.makeReacharge(199);
    }
}
