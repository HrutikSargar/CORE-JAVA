package Polymorphism.AmazonExample;

public class RegularAccount extends Amazon
{
    //Method Overriding ==>Rumtime Polymorphism
    @Override
    void openAccount() {
        System.out.println("Opening Regular account");
    }

    void useRegularFeatures(){
        System.out.println("you can place orders");
    }

}
