package Arrays;

import java.util.Scanner;

public class Problem3Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr = {10,20,30,40,50};

        System.out.print("Enter the number to find : ");
        int num = sc.nextInt();

        int a= 0;
        for(a=0;a < arr.length ;a++)
        {
            if (arr[a] == num)
            {
                System.out.println("Element is at "+a+ " index");
                break;
            }
        }

        if(a>arr.length-1)
        {
            System.out.println("Elemnet Not Found in the given Array");
        }
    }
}