package Abstraction.Bank3;

public class Transfer {
    Transactions tr = null;

    public Transfer(Transactions tr) {
        this.tr = tr;
    }

    public void sendMoney(long Acc1, long Acc2, double amt){
        int flag1 = -1;
        int flag2 = -1;
        for (int i = 0; i < tr.arr.length ; i++) {
            if (tr.arr[i].accountNo == Acc1)
            {
                flag1 = i;
            }else if(tr.arr[i].accountNo == Acc2){
                flag2 = i;
            }
        }

        if (flag1!=-1 && flag2!=-1)
        {
            if (tr.arr[flag1].accountBalance > amt)
            {
                tr.arr[flag1].accountBalance-=amt;
                tr.arr[flag2].accountBalance+=amt;
                System.out.println(amt + " Rs Amount Transferred successfully");
            }
            else {
                System.out.println("Insufficient Balance...");
            }
        }else{
            System.out.println("Invalid Account numbers...");
        }
    }
}
