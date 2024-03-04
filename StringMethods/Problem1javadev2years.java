package StringMethods;

public class Problem1javadev2years {

    public static void main(String[] args) {
        String str="abcdcaf";
//        char [] data=str.toCharArray();
//        for (int a=0;a< data.length;a++){
//            for (int b=1;b< data.length;b++){
//                if (data[a]==data[b]){
//                    System.out.println(data[a]);
//                    break;
//                }
//            }
//        }
//        int b=0;
        char [] data =str.toCharArray();
        int index;

        for (int a=1;a<data.length;a++){
            for (int b=a+1;b< data.length;b++){
                if (data[a]==data[b]){
                    index=str.indexOf(data[a]);
                    System.out.println(data[index]);

                }
            }

        }




//        {
//            if (s==(str.charAt(a))){
//                System.out.println(str.charAt(a));
//                b++;
//            }
//
//        }


    }
}
