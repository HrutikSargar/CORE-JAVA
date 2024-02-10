package Abstraction.Bank;
//STEP : 2
public class AxisBank implements  Bank{
    double accountBalance;

    public AxisBank(double accountBalance) {
        if (accountBalance>=5000){
            this.accountBalance = accountBalance;
            System.out.println("Account Opened Successfully !!");
        }else {
            System.out.println("Minimum Amount must be 5000 ..");
        }
    }

    @Override
    public void deposit(double amt) {
        accountBalance+=amt;
        double charges=amt*0.02;
        accountBalance-=charges;
        System.out.println(amt+" Rs is created to your account.");
    }

    @Override
    public void withdraw(double amt) {
        if (amt<=accountBalance){
            accountBalance-=amt;
            double charges=amt*0.02;
            accountBalance-=charges;
            System.out.println(amt+" Rs is debited from your account.");
            System.out.println("Welcome to Axis Bank");
        }else {
            System.out.println("Insufficient Balance");
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Active Account Balance is "+accountBalance);

    }
}
