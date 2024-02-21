package ExceptionHandling;

import java.util.Scanner;

public class throwEgException {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

//        System.out.println("Enter Product cost");
//        int cost = sc.nextInt();
//
//        System.out.println("Enter Product units");
//        int units = sc.nextInt();
//
//        calculateBill(cost,units);
        int []nums={3,2,4};
        int target=6;
        int [] data= twoSum(nums,target);
        for (int a: data) {
            System.out.println(a );
        }
    }

//    private static void calculateBill(int cost, int units) {
//    }
public static  int[] twoSum(int[] nums, int target) {
    boolean status=false;
    int [] sample=new int [2];
    for (int a=0;a<nums.length;a++){
        int sum=0;
        for (int b=a;b<nums.length;b++){
            sum+=nums[b];
            if(sum==target){
                status=true;
                sample[0]=a;
                sample[1]=b;
                break;
            }

        }
        if(status){
            break;
        }


    }
    return sample;

}
}
