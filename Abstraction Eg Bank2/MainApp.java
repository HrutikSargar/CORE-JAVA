package Abstraction.Bank2;

import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status=true;
        Transactions t1=new Transactions();
        while(status){
            System.out.println("1:deposit\n2:Withdraw\n3:Check Bal\n4:Exit");
            int choice= sc.nextInt();
            if (choice==1){
                System.out.println("Enter Account NO");
                long accountNo= sc.nextLong();
                System.out.println("Enter Deposit Amt");
                long amt= sc.nextLong();
                t1.deposit(accountNo,amt);
            } else if (choice==2) {
                System.out.println("Enter Account NO");
                long accountNo= sc.nextLong();
                System.out.println("Enter Withdraw Amt");
                long amt= sc.nextLong();
                t1.withDraw(accountNo,amt);
            }else if (choice==3){
                System.out.println("Enter Account NO");
                long accountNo= sc.nextLong();
                t1.checkBal(accountNo);
            }else if (choice==4){
                status=false;
            }
        }

    }
}
