package Arrays;
/*Concat given 2 array and store it in new third array and print the third array*/
public class Problem2LiteralArray {
    public static void main(String[] args) {
        int [] data1={5,10,15,16,18};
        int [] data2={12,24,36,4,21};
        //variable declared for idexing of final array.
        int index =0;
        //size of final array
        int [] result=new int[data1.length+ data2.length];

        //for first array
        for (int a=0;a< data1.length;a++){
            result[index] = data1[a];
            index++;
        }

        //for second array
        for (int a = 0;a< data2.length;a++){
            result[index]=data2[a];
            index++;
        }

        //for printing result array
        for (int a=0;a< result.length;a++){
            System.out.println(result[a]);
        }
    }
}
