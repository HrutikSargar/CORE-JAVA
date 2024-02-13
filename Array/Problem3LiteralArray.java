package Arrays;
/*array is given , if index is even ,do square and print it and if index is odd do cude and print it. */
public class Problem3LiteralArray {
    public static void main(String[] args) {

        int[] data={5,3,2,6,4,7,5,8};
        int [] result=new int[data.length];

        for (int a=0;a< data.length;a++){
            if (a%2==0){
                result[a]=data[a]*data[a];
                System.out.println(data[a]+" square is "+result[a]);
            }else {
                result[a]=data[a]*data[a]*data[a];
                System.out.println(data[a]+" cube is "+result[a]);
            }
        }
    }
}
