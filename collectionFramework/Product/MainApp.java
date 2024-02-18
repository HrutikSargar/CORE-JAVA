package collectionFramework.Product;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ProductOperation operation=new ProductOperation();
        boolean status = true;

        while(status){
            System.out.println("============================");
            System.out.println(" 1: Add Product");
            System.out.println(" 2: Delete Product");
            System.out.println(" 3:DisplayAllProduct");
            System.out.println(" 4:Find Product");
            System.out.println(" 5:update Product");
            System.out.println(" 6: Exit");
            System.out.println("=============================");
            int choice= sc.nextInt();

            switch (choice){

                case 1:
                    System.out.println("enter id");
                    int id= sc.nextInt();
                    System.out.println("Enter Name");
                    String name= sc.next();
                    System.out.println("enter Price");
                    double price= sc.nextDouble();

                    //add data to DTO object
                    Product p=new Product();
                    p.setProductId(id);
                    p.setProductName(name);
                    p.setProductPrice(price);

                    operation.addproduct(p);//call DOA class method
                    break;
                case 2:
                    System.out.println("Enter Id ");
                    id= sc.nextInt();

                    //add data to DTO object
                    Product p2=new Product();
                    p2.setProductId(id);

                    operation.deleteProduct(p2);//call DOA class method
                   break;

                case 3:
                    operation.displayAllProduct();
                    break;
                case 4:
                    System.out.println("enter Id ");
                    id= sc.nextInt();
                    //add data to DTO object
                    Product p1=new Product();
                    p1.setProductId(id);

                    operation.findProduct(p1);//call DOA class method
                    break;
                case 5:
                    System.out.println("Enter ProductId to update:");
                    id= sc.nextInt();

//                    System.out.println("Enter Product Id to update:");
//                    int idUpdate= sc.nextInt();
                    System.out.println("Enter updated Product Name :");
                     name= sc.next();
                    System.out.println("Enter updated Product Price :");
                    price= sc.nextDouble();

                    //add data to DTO object
                    Product p3=new Product();
                    p3.setProductId(id);
                    p3.setProductName(name);
                    p3.setProductPrice(price);

                    operation.updateProduct(p3);//call DOA class method
                    break;

                case 6:
                    status=false;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
