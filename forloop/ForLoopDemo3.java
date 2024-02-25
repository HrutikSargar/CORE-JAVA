package forloop;
import java.util.Scanner;

/*WAP to accept start and end point from user
* & print cube of all odd numbers */

public class ForLoopDemo3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Start point : ");
        int start= sc.nextInt();

        System.out.print("End point : ");
        int end= sc.nextInt();

        for (int x=start;x<=end;x++){
            if(x%2!=0){
                System.out.println(x+" cube is " +(x*x*x));
            }
        }

    }
}
