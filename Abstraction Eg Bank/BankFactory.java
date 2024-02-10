package Abstraction.Bank;

//Factory Class
public class BankFactory {
    Bank bank =null;
    Bank openAccount(int choice,double amt){
        if (choice==1){
            bank =new AxisBank(amt);
        } else if (choice==2) {
            bank =new IciciBank(amt);
        }else {
            System.out.println("Invalid Choice !!");
        }
        return bank;
    }
}
