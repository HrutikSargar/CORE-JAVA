package collectionFramework.Map.MapEGSubject;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean status=true;
        batch b1=new batch();
        while (status){
            System.out.println("======================");
            System.out.println("1: Add Subject Entry");
            System.out.println("2: Remove subject");
            System.out.println("3: view subject");
            System.out.println("4: Exit");
            System.out.println("====================");
            System.out.print("Enter choice : ");
            int choice= sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter batch code : ");
                    String batch= sc.next();
                    System.out.println("Enter subject : ");
                    String sub= sc.next();
                    b1.addSubject(batch,sub);
                    break;
                case 2:
                    System.out.println("Remove batch code  : ");
                    batch= sc.next();
                    b1.remove(batch);
                    break;
                case  3:
                    b1.subject();
                    break;
                case 4:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
