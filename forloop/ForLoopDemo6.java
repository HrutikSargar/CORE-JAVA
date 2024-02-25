package forloop;
import java.util.Scanner;
/*WAP to accept number from user. Print multiplication table for given table. */
public class ForLoopDemo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number=sc.nextInt();

        for (int x=1;x<=10;x++){
            int multi=number*x;
            System.out.println(number +" * "+x+" = "+(multi));
        }

    }
}
