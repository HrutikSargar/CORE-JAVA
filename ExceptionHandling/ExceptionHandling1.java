package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String []data={"abc","pqr","ref",null};
        System.out.println("Enter number ");
        try {
            int num = sc.nextInt();
            System.out.println(data[num].toUpperCase());
        }
        catch (InputMismatchException | ArrayIndexOutOfBoundsException | NullPointerException e){
                System.out.println(e);
        }
//        catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
//        catch (NullPointerException c){
//            System.out.println(c);
//        }
        System.out.println("Program Ended");
    }
}
