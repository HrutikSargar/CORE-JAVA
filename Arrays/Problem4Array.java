package Arrays;

import java.util.Scanner;

public class Problem4Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();

        int [] array =new int[size];

        System.out.print("Enter Elements  of Array : ");

        for (int a=0;a<size;a++){
            array[a]=sc.nextInt();
        }
        int sum=0;
        for (int a=0;a<size;a++){
            if (array[a]%2==0) {
                sum += array[a];
            }
        }
        System.out.println("Sum is "+ sum);
    }
}
