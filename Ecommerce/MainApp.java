package AbstractClass.Ecommerce;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
       try{
           Scanner sc = new Scanner(System.in);

           Ecommerce e[]={new Flipkart(),new Myntra()};
           System.out.println("Available Products on Flipkart & Myntra are ");
           for (int a=0;a<e[0].data.length;a++){
               System.out.println((a+1)+"\t"+e[0].data[a]);
           }
           System.out.print("Which no productChoice : ");
           int productChoice= sc.nextInt();

           System.out.print("how much qty : ");
           int qty= sc.nextInt();

           System.out.println("Which Application to use");
           System.out.println("1: Flipkart\n2: Myntra");
           int choice= sc.nextInt();
           if (choice==1){
               for (int a=0;a<e.length;a++){
                   if (e[a] instanceof Flipkart){
                       Flipkart f1=(Flipkart) e[a];
                       System.out.println("Price of "+e[0].data[productChoice-1]+" on flipkart is "+f1.prices[productChoice-1]);
                       System.out.println("===================");
                       f1.sellProducts(qty,productChoice);
                   }
               }
           }else if (choice==2){
               for (int a=0;a<e.length;a++){
                   if (e[a] instanceof Myntra){
                       Myntra f1=(Myntra) e[a];
                       System.out.println("Price of "+e[0].data[productChoice-1]+" on Myntra is "+f1.prices[productChoice-1]);
                       System.out.println("===================");
                       f1.sellProducts(qty,productChoice);
                   }
               }
           }
       }catch (Exception e){
           System.out.println(e);
       }
    }
}
