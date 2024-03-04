package StringMethods;

import java.util.Scanner;

public class TrimProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word ");
        String trimStr = sc.nextLine();
        String str =trimStr;
        int len=0;
        boolean status=str.isEmpty();

        if (!status){
            String [] data = str.split(" ");
            len= data.length;
            System.out.println("Count of words is "+len);

            for(int a=0;a<data.length;a++){
                int leng = data[a].length();
                System.out.println(data[a]+" length is "+leng);
            }
        }else{
            System.out.println("String is empty");
        }


    }
}
