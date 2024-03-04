package StringMethods;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str = "java_manual_j2ee_Spring";

        System.out.println(str);
        String [] data=str.split("_");
        int c= data.length;
        System.out.println(c);
//        for (int a=0;a<data.length;a++){
//            System.out.println(data[a]);
//        }

    }
}
