package Arrays;
/* Get Total no of items from user.create array of that size . store cost(values) in that array ,
 then sort the array in descending order and do total of sum of given items for billing from user and print that sum. */
import java.util.Scanner;

public class Problem5LiteralArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total No of Items : ");
        int items =sc.nextInt();

        int [] cost = new int[items];

        System.out.println("Enter cost of each Items");
        for (int a=0;a<items;a++){
            cost[a]= sc.nextInt();
        }
        int temp =0;
        for(int a=0;a< cost.length;a++){
            for (int b=a+1;b<cost.length;b++){
                if (cost[a]<cost[b]){
                    temp=cost[a];
                    cost[a]=cost[b];
                    cost[b]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for (int a=0;a<items;a++){
            System.out.println(" "+cost[a]);
        }
        System.out.print("Enter No of Items For Billing : ");
        int noOfItems= sc.nextInt();
        if (noOfItems>cost.length){
            System.out.println("Invalid No of items");
        }else {
            int sum=0;
            for (int a=0;a<noOfItems;a++){
                sum+=cost[a];
            }
            System.out.println("Total Bill Amt is "+sum);
        }
    }
}
