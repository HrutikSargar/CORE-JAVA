package StringMethods;

import java.util.Scanner;

public class Trim_isEmpty_String_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String name = sc.nextLine();
        String userName= name.trim();

        if (!userName.isEmpty()){
            System.out.println("Welcome "+userName);
        }else {
            System.out.println("invalid name");
        }
    }
}
