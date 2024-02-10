package Abstraction.Bank;
//STEP : 2
public class IciciBank implements Bank{
    double accountBalance;
    public IciciBank(double accountBalance) {
        if (accountBalance>=10000){
            this.accountBalance = accountBalance;
            System.out.println("Account Opened Successfully !!");
        }else {
            System.out.println("Minimum Amount must be 10000 ..");
        }
    }
    @Override
    public void deposit(double amt) {
        accountBalance+=amt;
        double charges=amt*0.03;
        accountBalance-=charges;
        System.out.println(amt+" Rs is created to your account.");
        System.out.println("Welcome to ICICI Bank");

    }
    @Override
    public void withdraw(double amt) {
        if (amt<=accountBalance){
            accountBalance-=amt;
            double charges=amt*0.03;
            accountBalance-=charges;
            System.out.println(amt+" Rs is debited from your account.");
        }else {
            System.out.println("Insufficient Balance");
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Active Account Balance is "+accountBalance);

    }
}
