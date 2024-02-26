package InheritanceExam.Question4;

import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserAuthentication u1=new UserAuthentication();
        System.out.println("Login Options ");

        System.out.println("1:loginByContactNumber and pass\n2:loginByEmail and pass");
        int choice= sc.nextInt();
        if (choice==1){
            System.out.println("Enter contact Number ");
            long contact= sc.nextLong();

            System.out.println("Enter password ");
            String pass= sc.next();

            u1.loginByContactNumber(contact,pass);

        }else if(choice==2) {
            System.out.println("Enter Email ");
            String email= sc.next();

            System.out.println("Enter Pass");
            String pass= sc.next();
            u1.loginByEmail(email,pass);
        }else {
            System.out.println("Invalid choice");
        }
    }
}
