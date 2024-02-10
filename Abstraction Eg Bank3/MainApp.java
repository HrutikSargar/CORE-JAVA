package Abstraction.Bank3;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transactions tr = new Transactions();
        Transfer tf = null;

        boolean status = true;
        while (status){
            System.out.println("Enter Mode of transaction : ");
            System.out.println("1 : Deposit");
            System.out.println("2 : Withdraw");
            System.out.println("3 : Check Balance");
            System.out.println("4 : Transfer money to Another Account");
            System.out.println("5 : receive money from Another Account ");
            System.out.println("6 : Exit");
            int mode = sc.nextInt();

            long accNo1 = 0;
            long accNo2 = 0;
            int index = 0;
            double amt = 0;

            switch (mode)
            {
                case 1:
                    System.out.println("\nEnter AccNo : ");
                    accNo1 = sc.nextLong();

                    System.out.println("Enter amt : ");
                    amt = sc.nextDouble();

                    tr.deposit(accNo1 , amt);
                    break;
                case 2:
                    System.out.println("\nEnter AccNo : ");
                    accNo1 = sc.nextLong();

                    System.out.println("Enter amt : ");
                    amt = sc.nextDouble();

                    tr.withdraw(accNo1, amt);
                    break;
                case 3:
                    System.out.println("\nEnter AccNo : ");
                    accNo1 = sc.nextLong();

                    tr.checkBalance(accNo1);
                    break;
                case 4:
                case 5:
                    tf = new Transfer(tr);

                    System.out.println("\nEnter Senders AccNo1 : ");
                    accNo1 = sc.nextLong();
                    System.out.println("\nEnter Receivers AccNo2 : ");
                    accNo2 = sc.nextLong();
                    System.out.println("Enter amt : ");
                    amt = sc.nextDouble();

                    tf.sendMoney(accNo1, accNo2, amt);
                    break;
                case 6:
                    status = false;
                    break;
                default:
                    System.out.println("Invalid Choice...!!!");
                    break;
            }
        }
    }
}
