package Arrays.TwoDArray;

import java.util.Scanner;

public class Problem2DArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total No of Sections : ");
        int section= sc.nextInt();

        System.out.print("Enter total No of book in each Senction : ");
        int totalBooks= sc.nextInt();
        int [][]books=new int[section][totalBooks];

        for(int a=0;a<books.length;a++){
            for (int b=0;b<books[a].length;b++){
                System.out.print("Enter Book id : ");
                books[a][b]= sc.nextInt();
            }
        }

        for(int a=0;a<books.length;a++){
            System.out.println("Section"+(a+1));
            for (int b=0;b<books[a].length;b++){

                System.out.print("Book Id is : "+books[a][b] +"\t");
            }
            System.out.println("");
        }


    }
}
