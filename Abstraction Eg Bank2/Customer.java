package Abstraction.Bank2;

public class Customer {
    long accountNo;
    String customerName;
    double accountBal;

    public Customer(long accountNo, String customerName, double accountBal) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.accountBal = accountBal;
    }
}
