package collectionFramework.set;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product p1=new Product();

     //  PrductOperation p1=new PrductOperation();

        boolean status=true;

        PrductOperation operation=new PrductOperation();
        while (status){
            System.out.println("OPTIONS ");
            System.out.println("1: View Products ");
            System.out.println("2: Add to cart ");
            System.out.println("3: View cart item");
            System.out.println("4: Remove cart item ");
            System.out.println("5: Exit ");
            System.out.println("Enter Choice : ");
            int choice= sc.nextInt();

            switch (choice){
                case 1:
                    operation.view();
                    break;
                case 2:
                    System.out.println("enter product Name");
                    String name=sc.next();
                    operation.addToCart(name);
                    break;
                case 3:
                    operation.viewCartItem();
                    break;

                case 4:
                    System.out.println("enter Product name");
                     name = sc.next();
                     operation.removeCartItem(name);
                     break;
                case 5:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
