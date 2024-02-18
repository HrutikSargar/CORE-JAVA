package collectionFramework.HashSet;

import java.util.*;

public class HAshSetDemo {
    public static void main(String[] args) {
        Set<Character> data=new HashSet<>();
        data.add('a');
        data.add('w');
        data.add('e');
        data.add('r');
        data.add('t');
        data.add('y');
        LinkedHashSet<Character> data2=new LinkedHashSet<>();
        data2.add('q');
        data2.add('u');
        data2.add('i');
        data2.add('o');
        data2.add('p');
        data2.add('a');
        Set<Character> data3=new TreeSet<>();
        data3.add('w');
        data3.add('e');
        data3.add('r');
        data3.add('t');
        data3.add('y');

        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);
    }
}
