package forloop;
/*WAP to accept positive integer from user and print it. */
import java.util.Scanner;

public class WhileLoopDemo1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Program Started");

        int no=0;
        while(no>=0){
            System.out.print("Enter Number : ");
            no=sc.nextInt();
            System.out.println("You have entered : " + no);
        }
        System.out.println("Program Ended");
    }
}
