package StringMethods.ProblemsInClass;

import java.util.Scanner;

public class Capital1AndLastLetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        String [] data=str.split(" ");
        String s4="";
        for (int a=0;a< data.length;a++){
            String s1=data[a].substring(0,1).toUpperCase();
            String s2=data[a].substring(1,data[a].length()-1);
            String s3=data[a].substring(data[a].length()-1).toUpperCase();

            s4+=s1+s2+s3+" ";

        }
        s4=s4.trim();
        System.out.println(s4);


    }
}
