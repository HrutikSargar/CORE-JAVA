package StringMethods;
/*Do first character of every word capital and then print it. */
public class SplitProblem1 {
    public static void main(String[] args) {
        String s="java is object oriented";
        String [] data=s.split(" ");

        for (int a=0;a< data.length;a++){

            System.out.println(data[a].substring(0,1).toUpperCase()+data[a].substring(1));
        }
        System.out.println("==========================");
        for (int a= data.length-1;a>=0;a--){
            System.out.println(data[a].substring(0,1).toUpperCase()+data[a].substring(1));
        }
    }
}
