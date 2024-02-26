package GetterAndSetter;

public class Product {
    private int productId=101;
    private double productPrice=10000;

    //Getter -->read access -->non-void
    public int getProductId() {
        return productId;
    }
    //Setter -->write access -->void
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
    //Getter -->read access -->non-void
    public double getProductPrice() {
        return productPrice;
    }
    //Setter -->write access -->void
    public void setProductPrice(double productPrice) {

        if (productPrice>0){
            this.productPrice = productPrice;
        }else {
            System.out.println("Invalid Price");
        }

    }




}
