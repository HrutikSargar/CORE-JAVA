package Arrays.TwoDArray;

import java.util.Scanner;

public class Problem2DArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total No of Rows : ");
        int rows= sc.nextInt();

        System.out.print("Enter total No of Columns : ");
        int cols= sc.nextInt();

        int [][]data = new int[rows][cols];
        System.out.print("Enter values : \t");
        for (int a=0;a< data.length;a++){
            for (int b=0;b<data[a].length;b++){
                data[a][b]= sc.nextInt();
            }
        }
        System.out.println("=====================================");
        for (int a=0;a< data.length;a++){
            for (int b=0;b<data[a].length;b++){
                System.out.print(data[a][b]+"\t\t");
            }
            System.out.println("");
        }


    }
}
