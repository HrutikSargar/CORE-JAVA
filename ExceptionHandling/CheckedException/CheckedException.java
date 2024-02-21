package ExceptionHandling.CheckedException;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
         FileWriter fw=null;
        String data="";
        try{
            try{
                System.out.println("Enter id ");
                String productId = sc.next();

                System.out.println("Enter name ");
                String productName = sc.next();

                System.out.println("Enter productPrice ");
                String productPrice = sc.next();
                Double price1=Double.parseDouble(productPrice);
                Double charge=price1*.10;
                price1+=charge;

                data+=productId+"\t"+productName+"\t"+price1;
            }catch (Exception e){
                System.out.println(e);
            }
            fw= new FileWriter("C:\\Users\\Hrutik\\OneDrive\\Desktop\\javaExp\\myfile.txt",true);
//            fw.write(data);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(data);
            System.out.println("file created");

        }catch(NullPointerException e){
            System.out.println(e);
        }catch (FileNotFoundException e){
            System.out.println( e);
        }catch (IOException e){
            System.out.println(e);
        }
        finally {
            try{
                fw.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }
        System.out.println("Program ended");
    }
}
