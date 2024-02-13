package Arrays;
/*given array split into two new arrays , based on index is Even OR Odd. */
public class Problem4LiteralArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70,80,90,100,110};
        int[] even =new int[(arr.length/2)+2];
        int[] odd =new int[arr.length];
        int index=0;

        for (int a=0;a< arr.length;a++){
            if(a%2==0){
                even[a]=arr[a];

            }else{
                odd[a]=arr[a];
            }
        }

        System.out.println("Even position values ");
        for (int a=0;a< even.length;a++){
            System.out.print(even[a]+" ");
        }

        System.out.println("Odd position values ");
        for (int a=0;a< even.length;a++){
            System.out.print(odd[a]+" ");
        }


    }
}

/*given array split into two new arrays , based on index is Even OR Odd. */
//public class SplitArray {
//    public static void main(String[] args) {
//        int []arr = {10,20,30,40,50,60,70,80,90,100,110};
//
//        int Odd = arr.length/2;
//        int Even = arr.length - Odd;
//
//        int []even = new int[Even];
//        int []odd = new int[Odd];
//
//        int eCnt = 0;
//        int oCnt = 0;
//        for(int i = 0; i < arr.length ; i++)
//        {
//            if(i%2==0)
//            {
//                even[eCnt] = arr[i];
//                eCnt++;
//            }
//            else
//            {
//                odd[oCnt] = arr[i];
//                oCnt++;
//            }
//        }
//
//        System.out.print("EVEN : ");
//        for(int a : even)
//        {
//            System.out.print(a + "\t");
//        }
//        System.out.print("\nODD : ");
//        for(int a : odd)
//        {
//            System.out.print(a + "\t");
//        }
//    }
//}