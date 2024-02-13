package Arrays;

import java.util.Scanner;

public class StringArrayProblem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductSimulator simulator = new ProductSimulator();

        boolean status = true;
        while(status){
            System.out.println("1:Search Products ");
            System.out.println("2:Purchase Products");
            System.out.println("3:Exit");

            System.out.println("");
            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            if (choice==1){
                System.out.print("enter Product Name : ");
                String name = sc.next();
                simulator.searchProduct(name);
            } else if (choice==2) {
                simulator.display();
                System.out.print("Enter Choice : ");
                int productChoice = sc.nextInt();
                System.out.print("Enter QTY : ");
                int qty= sc.nextInt();
                simulator.purchaseProduct(productChoice ,qty);
            }else {
                status=false;
            }
        }

    }
}
