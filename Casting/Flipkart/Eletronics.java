package Castingg.Flipkart;

public class Eletronics extends Flipkart{
    String items[]={"Fridge","Fan","AC"};
    @Override
    void getProducts() {
        System.out.println("Selling electronic items");
    }
    void getEletronicsItems(){
        System.out.println("Sellinng Elletronics items");
        for (int a=0;a<items.length;a++){
            System.out.print(items[a]+"\t");
        }
    }

}
