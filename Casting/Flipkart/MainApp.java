package Castingg.Flipkart;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Flipkart f1;
//        f1=new Mobiles();
//        f1.getProducts();
//
//        f1=new Eletronics();
//        f1.getProducts();

        Flipkart [] f2={new Mobiles(),new Eletronics()};
        for (int a=0;a<f2.length;a++){
            f2[a].getProducts();
        }

        System.out.println("Select Category");
        System.out.println("1:Mobiles\n2:Eletronics");
        int choice=sc.nextInt();

        if (choice==1){
//            f1=new Mobiles();
            Mobiles m1=(Mobiles) f2[0];
            m1.getMobilesData();
        }else if(choice==2){
            Eletronics e1=(Eletronics) f2[1];
            e1.getEletronicsItems();
        }else {
            System.out.println("Invalid choice");
        }
    }
}
