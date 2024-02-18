package collectionFramework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrductOperation {
     static  Set<String> data=new HashSet<>();

     static  Set<String> cartItem=new LinkedHashSet<>();
    PrductOperation() {
        data.add("abc");
        data.add("efg");
        data.add("hij");
        data.add("klm");
        data.add("opq");
    }
    public void view() {
        System.out.println(data);
    }

    public void addToCart(String p2) {
       if (data.contains(p2)){
           cartItem.add(p2);
       }else {
           System.out.println("product not available");
       }
    }

    public void viewCartItem() {
        System.out.println(cartItem);
    }

    public void removeCartItem(String p3) {
        if (cartItem.contains(p3)){
            cartItem.remove(p3);
            System.out.println("item remover successfully");
        }else
        {
            System.out.println("Item not fond");
        }
    }
}
