package forloop;
/*WAP to accept number from user & perform the sum of given numbers .
  Process will continue until the summation value becomes 50. */
import java.util.Scanner;

public class WhileLoopDemo3SumOFGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum =0;

            while(sum<50){
                System.out.print("Enter Number : ");
                int num= sc.nextInt();

                sum+=num;
            }


        System.out.println("summation reached 50");
//        System.out.println("summation is "+sum);


    }
}
