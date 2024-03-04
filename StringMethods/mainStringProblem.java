package StringMethods;

import java.util.Scanner;

public class mainStringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        String userName=name.trim();
        if (userName.length()<=3||userName.isEmpty()){
            System.out.println("Invalid username");
        }else {
            System.out.print("Enter email : ");
            String email= sc.next();
            if (email.contains("@") && email.contains(".")){
                String userEmail=email;
                System.out.println("Enter Password");
                String pass= sc.next();
                if (pass.length()>=6 && pass.length()<=8){
                    String userPass=pass;
                    System.out.println("Confirm Pass : ");
                    String conPass= sc.next();
                    if (conPass.equals(userPass)){
                        System.out.println("Welcome user "+userName.toUpperCase());
                    }else{
                        System.out.println("Invalid password");
                    }
                }else{
                    System.out.println("Invalid password");
                }
            }else {
                System.out.println("Invalid Email");
            }
        }
    }
}
