package Abstraction.Bank2;

public class Transactions{
    Customer [] data =new Customer[3];
        {
           data[0]= new Customer(1234,"Hrutik",1000);
           data[1]= new Customer(12345,"Shubham",2000);
           data[2]= new Customer(123456,"Kunal",3000);
        }
    void deposit(long acc, double amt){
          boolean status = false;
        int temp  =0;
        for (int a=0;a< data.length;a++) {
            if (data[a].accountNo == acc) {
                status = true;
                temp=a;
            }
        }
        if (status) {
            data[temp].accountBal = data[temp].accountBal + amt;
        }else {
            System.out.println("invalid Account No");
        }
    }

    void withDraw(long acc, double amt){
        boolean status = false;
        int temp  =0;
        for (int a=0;a< data.length;a++) {
            if (data[a].accountNo == acc) {
                status = true;
                temp=a;
            }
        }
        if (status) {
            data[temp].accountBal = data[temp].accountBal - amt;
        }else {
            System.out.println("Invalid Account No");
        }
    }
    void checkBal(long accNO){
            boolean status = false;
            int temp  =0;
        for (int a=0;a< data.length;a++) {
            if (data[a].accountNo == accNO) {
                status = true;
                temp=a;
            }
        }
        if (status) {
            System.out.println("available Balance is "+data[temp].accountBal);
        }else {
            System.out.println("Invalid Account NO");
        }
    }
}
