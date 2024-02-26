package GetterAndSetter;

public class MainApp1 {
    public static void main(String[] args) {
        Product p1 = new Product();

        System.out.println("Id "+p1.getProductId());
        System.out.println("Price "+p1.getProductPrice());

        p1.setProductPrice(-1200);
        System.out.println("Price "+p1.getProductPrice());
    }
}
