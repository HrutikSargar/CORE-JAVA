package Arrays;
/*two array are given perform summation of each index value and store it in new array(third array)*/
public class Problem1LiteralArray {

    public static void main(String[] args) {
        int [] data1={5,10,15,16,18};
        int [] data2={12,24,36,4,21};

        //size of third array(result array)
        int [] result=new int[data2.length];

        //for addition of two arrays
        for (int a=0;a< data1.length;a++){
          result[a] = data1[a]+data2[a];
        }
        //to print resulting array
        for (int a=0;a< data1.length;a++){
            System.out.println(result[a]);
        }
    }
}
