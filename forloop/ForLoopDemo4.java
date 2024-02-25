package forloop;
import java.util.Scanner;
/*WAP to accept start & end point from user .
  Print all the even numbers in reverse order*/

public class ForLoopDemo4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Start point : ");
        int start= sc.nextInt();

        System.out.print("End point : ");
        int end= sc.nextInt();

        for (int x=end;x>=start;x--){
            if(x%2==0){
                System.out.print(x +"\t");
            }
        }
    }
}
