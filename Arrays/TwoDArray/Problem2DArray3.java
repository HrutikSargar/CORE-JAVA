package Arrays.TwoDArray;

import java.util.Scanner;

public class Problem2DArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Products : ");
        int products= sc.nextInt();

        int [][]data =new int [products][2];

        int sum=0;
        for (int a=0;a<products;a++){
            System.out.print("enter ID : ");
            data[a][0]= sc.nextInt();
            System.out.print("enter cost : ");
            data[a][1]= sc.nextInt();

            sum=sum+data[a][1];
        }
        System.out.println("=====================================");
        for (int a=0;a<products;a++){
            for (int b=0;b<data[a].length;b++){
                System.out.print(data[a][b]+"\t\t");
            }
            System.out.println("");
        }
        System.out.println("SUM IS "+sum);
    }
}
