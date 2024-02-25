package forloop;
/*WAP to calculate power of any given number. */
import java.util.Scanner;

public class WhileLoopDemo2_PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base : ");
        int base = sc.nextInt();

        System.out.print("Enter expo : ");
        int expo = sc.nextInt();
        int ans =1;
        while(expo>0){
            ans = ans *base;
            expo--;

        }
        System.out.println("Ans is : "+ans);




    }
}
