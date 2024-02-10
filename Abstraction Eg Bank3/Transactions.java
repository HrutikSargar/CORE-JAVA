package Abstraction.Bank3;

public class Transactions {

    Customer[] arr = new Customer[5];

    {
        arr[0] = new Customer(1234, "aaaa", 5000);
        arr[1] = new Customer(2345, "bbbb", 10000);
        arr[2] = new Customer(3456, "cccc", 7000);
        arr[3] = new Customer(4567, "dddd", 8000);
        arr[4] = new Customer(5678, "eeeee", 12000);
    }

    void deposit(long accNo , double amt){
        int flag = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].accountNo == accNo)
            {
                arr[i].accountBalance+=amt;
                flag = 1;
            }
        }
        if (flag == 1){
            System.out.println(amt + " RS Credited Successfully");
        }else {
            System.out.println("Invalid Account No.");
        }
    }

    void withdraw(long accNo , double amt) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].accountNo == accNo) {
                if (arr[i].accountBalance > amt) {
                    arr[i].accountBalance -= amt;
                    flag = 1;
                } else {
                    flag = 2;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println(amt + " RS Debited Successfully");
        } else if (flag == 0) {
            System.out.println("Invalid Account No.");
        } else if (flag == 2){
            System.out.println("insufficient balance");
        }
    }

    void checkBalance(long accNo){
        int flag = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].accountNo == accNo)
            {
                System.out.println("Available Balance : "+arr[i].accountBalance);
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("Invalid Account No.");
        }
    }
}
