package Arrays;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Elements : ");
        int count = sc.nextInt();

        int [] data = new int[count];

        System.out.println("Enter values : ");
        for (int a=0;a<count;a++){
            data[a]=sc.nextInt();
        }
        System.out.println("========================");
        for (int a=0;a<count;a++){
            System.out.println(data[a]);
        }
    }
}
