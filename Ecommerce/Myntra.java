package AbstractClass.Ecommerce;

public class Myntra extends Ecommerce{
    double prices[]={123.33,4323.343,344.66};

    @Override
    void sellProducts(int qty, int productChoice) {
        double total=qty*prices[productChoice-1];
        double dics=total*0.15;
        System.out.println("Total price is "+(total-dics));
    }


}
