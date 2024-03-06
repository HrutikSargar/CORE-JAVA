package Upcasting.OlaProblem;
public class Auto extends Ola{
    int perKm=5;
    @Override
    void getServicetype() {
        System.out.println("Service type is Ola Auto");
    }
    @Override
    void getServiceCharges(int km) {
        int total =perKm*km;
        if (km<10){
            double discount=total*0.05;
            double charge=total-discount;
            System.out.println("Charges are "+charge);
        }else if (km<30){
            double discount=total*0.10;
            double charge=total-discount;
            System.out.println("Charges are "+charge);
            //do with ternary operator

        }else {
            System.out.println("Charges are "+total);
        }

    }
}
