package Polymorphism.AmazonExample;

public class PrimeAccount extends Amazon{
    //Method Overriding ==>Runtime Polymorphism
    @Override
    void openAccount() {
        System.out.println("Opening account with amazon prime");
    }
    //Method Overriding==>Compile time Poymorphism
    void usePrimeFeatures(int Deliverytime ){
        System.out.println("Order will be dilevered in " +Deliverytime+" days");
    }
    void usePrimeFeatures(String appName){
        System.out.println("Using Amazon Prime"+appName);
    }

}
