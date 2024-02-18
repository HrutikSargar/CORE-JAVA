package collectionFramework;

import java.util.ArrayList;

public class ArrayList1 {
    public static  void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        int num=3;
       data.add(1);
       data.add(2);
       data.add(3);
       data.add(2);
       data.add(4);
       data.add(2);

       data.remove(data.indexOf(3));
        for (int a:data) {
            System.out.println(a);
        }
        Object[] arr=data.toArray();
        System.out.println();
        for (Object a:arr) {
            System.out.println(a);
        }
    }
}
