package Polymorphism.AmazonExample;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Amazon a1;

        Amazon [] account={new PrimeAccount(),new RegularAccount()};


        for (int a=0;a<account.length;a++){
            account[a].openAccount();
        }

        System.out.println("Enter Account choice");
        System.out.println("1: Prime\n2:regular account");
        int choice= sc.nextInt();

        if (choice==1){
            for (int a=0;a<account.length;a++){
                if (account[a] instanceof PrimeAccount){
                    PrimeAccount p1=(PrimeAccount) account[a];
                    p1.usePrimeFeatures("songs");
                    p1.usePrimeFeatures(2);
                }
            }
        }else if(choice==2){
            for (int a=0;a<account.length;a++){
                if (account[a] instanceof RegularAccount){
                    RegularAccount r1=(RegularAccount) account[a];
                    r1.useRegularFeatures();
                }
            }
        }else{
            System.out.println("Invalid choice");
        }
    }
}
