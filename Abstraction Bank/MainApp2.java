package Abstraction.Bank;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select Bank");
        System.out.println("1.Axis Bank \n2.ICICI Bank ");
        System.out.print("Enter Choice: ");
        int choice= sc1.nextInt();
        System.out.print("Enter Initial Amount: ");
        double initialAmt= sc1.nextDouble();
        BankFactory b1=new BankFactory();
        Bank bank =b1.openAccount(choice,initialAmt);

        boolean status=true;
        while (status){
            System.out.println("Select Mode of Transaction:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int mode= sc1.nextInt();
            switch (mode){
                case 1:
                    System.out.print("Enter Amount: ");
                    double depositAmt= sc1.nextDouble();
                    bank.deposit(depositAmt);
                    break;
                case 2:
                    System.out.print("Enter Amount: ");
                    double withdrawAmt= sc1.nextDouble();
                    bank.withdraw(withdrawAmt);
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                default:
                    status=false;
            }
        }
    }
}