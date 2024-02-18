package collectionFramework.LinkedList;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> data=new LinkedList<>();

        data.add("java");
        data.add("j2ee");
        data.addFirst("Spring");
        System.out.println(data);
        data.addLast("Hibernate");
        System.out.println(data);
        data.add(2,"wt");
        System.out.println(data);
        data.removeFirst();
        System.out.println(data);
        data.removeLast();
        System.out.println(data);
    }
}
