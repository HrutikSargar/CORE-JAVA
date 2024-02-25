package forloop;

import java.util.Scanner;

/*WAP to accept start & end point from user .
* Perform summation if number is divisible by 3 and multiplication if number is divisible by 5. */
public class ForLoopDemo8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Start point : ");
        int start= sc.nextInt();

        System.out.print("End point : ");
        int end= sc.nextInt();
        int summation=0;
        int multi=1;
        for (int x=start;x<=end;x++){
            if (x%3==0 && x%5==0){
                System.out.println("divisible by both");

            } else if (x%3==0 ) {
                summation=summation+x;
                System.out.println("Number "+x+" is divisible by 3");

            } else if (x%5==0) {
                 multi=multi*x;
                System.out.println("Number "+x+" is divisible by 5");
            }
        }
        System.out.println("===========================");
        System.out.println("Summation is "+summation);
        System.out.println("Multiplication is "+multi);

    }
}
