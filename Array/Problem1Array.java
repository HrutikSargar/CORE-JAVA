package Arrays;

import java.util.Scanner;

public class Problem1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total No of Subjects : ");
        int totalSub=sc.nextInt();
        double totalMarks=0;
        double [] marks=new double[totalSub];
        System.out.println("Enter marks : ");
        for (int a=0;a<totalSub;a++){
            marks[a]=sc.nextDouble();
        }
        for (int a=0;a<marks.length;a++){
             totalMarks+=marks[a];
        }
        System.out.println("Total Marks are : "+totalMarks);
        double pecr=(totalMarks/totalSub);
        System.out.println("Total percentage : "+pecr);
        System.out.println("result : "+((pecr>35)?"Pass":"Fail"));

//        if(pecr<35){
//            System.out.println("fail");
//        }else{
//            System.out.println("pass");
//        }

    }
}
