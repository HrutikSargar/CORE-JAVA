package forloop;

import java.util.Scanner;

public class WhileLoopDemo4_AreaOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;


        while(status == true){
            System.out.println("Enter mode Operation");
            System.out.println("1 : Area Of Circle");
            System.out.println("2 : Area Of Traingle");
            System.out.println("1 : Exit");
            System.out.println("Enter mode Operation : ");
            int choice = sc.nextInt();

            if(choice==1){
                System.out.print("Enter Radius : ");
                double rad = sc.nextDouble();
                areaOfCircle(rad);

            } else if (choice==2) {
                System.out.print("Enter Base : ");
                double base = sc.nextDouble();

                System.out.print("Enter Height : ");
                double height = sc.nextDouble();
                areaOfTraingle(base,height);
            }else {
                status=false;
                System.out.println("Operation Ended");
            }
        }
    }
    static void areaOfCircle(double rad){
        double ans= 3.14 * rad *rad;
        System.out.println("Area Of Circle is : "+ans);
    }
    static void areaOfTraingle(double base,double height){
        double ans= 0.5*base*height;
        System.out.println("Area Of Circle is : "+ans);
    }
}
