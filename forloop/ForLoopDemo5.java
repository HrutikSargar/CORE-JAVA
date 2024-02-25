package forloop;

import java.util.Scanner;

/*WAP to accept start & end point from user.
Print summation of all the numbers present within range*/
public class ForLoopDemo5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Start point : ");
        int start= sc.nextInt();

        System.out.print("End point : ");
        int end= sc.nextInt();

        int sum=0;

        for(int x=start;x<=end;x++){
             sum=sum+x;

        }
        System.out.println("Summation is "+sum);
    }
}
