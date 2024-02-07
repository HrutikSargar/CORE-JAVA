package AbstractClass.Ecommerce;

public class Flipkart extends Ecommerce {
    double[] prices = {1200.43, 31322.3, 45321.121};

    @Override
    void sellProducts(int qty, int productChoice) {
        double total = qty * prices[productChoice - 1];
        double dics = total * 0.10;
        System.out.println("Total price is " + (total - dics));


    }
}


