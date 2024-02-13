package Arrays;

public class ProductSimulator {
    String [] products = {"WATCH","MOBILE","HEADPHONES"};
    double [] prices ={5000,15000,3000};
    int [] stock ={40,30,60};
    public void searchProduct(String name) {
        boolean found= false;
        for (int a=0;a< products.length;a++){
            if (products[a].equals(name)){
                System.out.println("Product name is "+products[a]);
                System.out.println("Product price is"+prices[a]);
                System.out.println("Product QTy is : "+stock[a]);
                found=true;
            }

        }
        if (!found){
            System.out.println("Product Not Found ");
        }
    }

    public void display() {
        for (int a=0;a< products.length;a++){
            System.out.println((a)+": "+products[a]);
        }
    }

    public void purchaseProduct(int productChoice,int qty) {
        boolean found= false;
        if (productChoice<=products.length){
            for (int a=0;a<products.length;a++){

                    if (a==productChoice && stock[a]>=qty){
                        System.out.println("Available Stock is : "+stock[a]);
                        System.out.println("Product price is : "+prices[a]);

                        double total = qty*prices[a];
                        System.out.print("Cost is "+total);
                        System.out.println("");
                        stock[a]-=qty;
                        System.out.println("Available stock is "+ stock[a]);
                        break;
                    }else if (stock[a]<qty){
                        System.out.println("Out of Stock");
                    }
                    found= true;
            }
        }
        if (!found){
            System.out.println("Prduct Not Found");
        }
    }

//    public void purchaseProduct(int productChoice,int qty) {
//        boolean found= false;
//        if (productChoice<=products.length){
//            for (int a=0;a<products.length;a++){
//
//                if ( stock[productChoice]>=qty){
//                    System.out.println("Available Stock is : "+stock[productChoice]);
//                    System.out.println("Product price is : "+prices[productChoice]);
//
//                    double total = qty*prices[productChoice];
//                    System.out.print("Cost is "+total);
//                    System.out.println("");
//                    stock[productChoice]-=qty;
//                    System.out.println("Available stock is "+ stock[productChoice]);
//                    found= true;
//                    break;
//                }
//
//
//
//            }
//            if (!found){
//                System.out.println("out of stock");
//            }
//
//
//        }
//        else {
//           // System.out.println("Out of Stock");
//            System.out.println("Prduct Not Found");
//
//        }
////        if (!found){
////            System.out.println("Prduct Not Found");
////        }
//    }
}
