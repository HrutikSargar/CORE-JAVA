package StringMethods;
/*Find out Vowels and consonants in the Given String */
import java.util.Locale;
import java.util.Scanner;

public class toCharArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str= sc.next().toLowerCase();

        char [] data=str.toCharArray();
        int cVowels=0;
        int cConsonants=0;
        for (int a=0; a< data.length;a++){
           if (data[a]=='a'||data[a]=='e'||data[a]=='i'||data[a]=='o'||data[a]=='u'){
                    cVowels++;
           }else {
              cConsonants++;
           }

        }
        System.out.println("Total vowels are : "+cVowels);
        System.out.println("total consonants are : "+cConsonants);

    }
}
