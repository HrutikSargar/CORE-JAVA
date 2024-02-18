package collectionFramework.Product;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ProductOperation {
    ArrayList<Product> data=new ArrayList<>();

    public void addproduct(Product p){
        data.add(p);
        System.out.println("Product added successfully");
    }
    public void displayAllProduct(){
        System.out.println("=======================");
        for (Product p:data) {
            System.out.println(p);
        }
        System.out.println("=======================");
    }
    public void findProduct(Product p1){
        boolean found= true;
        for (Product p:data) {
            if (p.getProductId()==p1.getProductId()){
                System.out.println(p);
                found=false;
            }
        }
        if (found){
            System.out.println("Product not found");
        }
    }
    public void deleteProduct(Product p1) {
        boolean flag=true;

        ListIterator<Product> itr= data.listIterator();
     //  Iterator<Product> itr =data.iterator();//we are performing two operation simultaneously (remove and getProductId )that's why we are using iterator
        while (itr.hasNext()){
            if (itr.next().getProductId()== p1.getProductId()){
              data.remove(p1);

                System.out.println("Product removed successfully");
                flag=false;
            }
        }
        if (flag){
            System.out.println("Product not found");
        }
    }

    public void updateProduct(Product p3) {
        boolean flag=true;
        for (Product p:data){
            if (p.getProductId()==p3.getProductId()){
                p.setProductName(p3.getProductName());
                p.setProductPrice(p3.getProductPrice());
                System.out.println("Product updated successfully");
                flag=false;
            }
        }
        if (flag){
            System.out.println("Product not found to update ");
        }
    }
}
