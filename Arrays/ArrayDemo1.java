package Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //array declaration
        int [] arr;
        //size allocation to array
        arr = new int[5];
        //Initialization
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;

        //regular fpr loop
        for(int a=0;a<5;a++){
            System.out.println(arr[a]);
        }
        System.out.println("=========================");
        for(int a=4;a>=0;a--){
            System.out.println(arr[a]);
        }
        System.out.println("=========================");
        //enhanced for loop
        for (int i:arr) {
            System.out.println(i);
        }

    }
}
