package forloop;

import java.util.Scanner;

/*WAP to accept count of users Accept username for the specified no of users .
and display welcome message for each user */
public class ForLoopDemo7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter No Of Users : ");
        int noOfUsers= sc.nextInt();

        for(int x=1;x<=noOfUsers;x++){
            System.out.print("Enter name os user : ");
            String name=sc.next();
            System.out.println("Welcome ! "+name);
        }

    }
}
