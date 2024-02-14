package Castingg.Flipkart;

public class Mobiles extends  Flipkart{
    String data[]={"Realme","Apple","Samsung","OnePlus"};
    @Override
    void getProducts() {
        System.out.println("Selling mobils products");
    }
    void getMobilesData(){
        System.out.println("Selling mobile phones of various Brands");
        for(int a=0;a< data.length;a++){
            System.out.print((a+1)+"\t"+data[a]+"\t");
        }
    }

}
