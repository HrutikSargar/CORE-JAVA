package Arrays;

import java.util.Scanner;

public class Problem2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total No of items : ");
        int items = sc.nextInt();

        double [] price=new double[items];

        System.out.println("Enter Price of items : ");
        for (int a=0;a<items;a++){
            price[a]= sc.nextDouble();
        }
        System.out.println("OrgCost"+"\t"+"GstAmt"+"\t"+"total");
        for (int a=0;a<items;a++){
            System.out.println(price[a]+"\t"+price[a]*0.05+"\t"+(price[a]+price[a]*0.05));
        }
    }
}
//        double gst =0;
//        double []totalGst=new double[items];
//        double []gstArr = new double[items];
//        for (int a=0;a< price.length;a++){
//            gst = price[a]*0.05;
//            gstArr[a]=gst;
//             totalGst[a]= price[a]+gst;
//        }

//        System.out.println("OrgCost"+"\t"+"GstAmt"+"\t"+"total");
//        for (int a=0;a<items;a++){
//            System.out.println(price[a]+"\t"+gstArr[a]+ "\t"+totalGst[a]);
//        }

