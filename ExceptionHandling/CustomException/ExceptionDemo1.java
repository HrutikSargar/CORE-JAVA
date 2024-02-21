package ExceptionHandling.CustomException;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Email:");
        String email= sc.next();
       try{
           validateEmail(email);
       }catch(InvalidEmailException e){
           System.out.println(e);
       }
       finally {
           System.out.println("External resources closed");
       }
    }

    private static void validateEmail(String email) {
        if (email.contains("@") && email.contains(".")){
            System.out.println("Email VAliddation Complete");
        }else {
            throw new InvalidEmailException("Invalid email");
        }
    }
}
