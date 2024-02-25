package forloop;
import  java.util.Scanner;
/*WAP to accept start point and end point from user & print
 all the even numbers present within specified range*/
public class ForLoopDemo2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Start point");
        int start= sc.nextInt();

        System.out.println("End point");
        int end= sc.nextInt();

        for (int x=start;x<=end;x++){
            if(x%2==0){
                System.out.print(x +"\t");
            }
        }


    }
}
