package collectionFramework.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> data = new Stack<>();
        data.push(5);
        data.push(12);
        data.push(36);
        data.push(78);



        System.out.println(data.indexOf(5));
        System.out.println(data.search(5));
        System.out.println(data);//[5,12,36,78]

        System.out.println();
        System.out.println("top element "+data.peek());//78
        data.pop();//78
        System.out.println("top element "+data.peek());//36
        System.out.println("data search "+data.search(5));//3
        data.pop();//36
        System.out.println("top element "+data.peek());//12
        System.out.println("is empty"+data.isEmpty());//false
        data.clear();
        System.out.println("is empty"+data.isEmpty());//true




        //System.out.println(data);
    }
}
