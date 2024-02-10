package Abstraction.Bank3;

public class Customer {
    long accountNo;
    String customerName;
    double accountBalance;

    public Customer(long accountNo, String customerName, double accountBalance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }
}
