package collectionFramework.Map;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Character,Integer> data=new LinkedHashMap<>();

        data.put('A',65);
        data.put('B',66);
        data.put('C',67);
        data.put('D',68);
        data.put('E',69);

        //option-1
        System.out.println(data);

        //option-2
        Set<Character> keys=data.keySet();
        for (Character c:keys) {
            System.out.println(c);
        }
        //option-3
        System.out.println("===================");
        Collection<Integer>value=data.values();
        for (Integer i:value) {
            System.out.println(i);
        }
        //option-4
        System.out.println("====================");
        Set<Map.Entry<Character,Integer>> entries=data.entrySet();
        for (Map.Entry<Character,Integer> entry:entries) {
            System.out.println(entry);
        }
        System.out.println("==============");
        for (Map.Entry<Character,Integer> entry:entries) {
            System.out.println(entry.getKey()+"\t\t"+entry.getValue());
        }
    }
}
