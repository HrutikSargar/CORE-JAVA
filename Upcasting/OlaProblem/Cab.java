package Upcasting.OlaProblem;

public class Cab extends Ola{
    int perKm=8;
    @Override
    void getServicetype() {
        System.out.println("Service by Ola Cab");
    }
    @Override
    void getServiceCharges(int km) {
        int total =perKm*km;
        if (km<10){
            double disc=0.04;
            double discount=total*disc;
            double charge=total-discount;
            System.out.println("Charges are "+charge);
        }else if (km<30){
            double disc=0.08;
            double discount=total*disc;
            double charge=total-discount;
            System.out.println("Charges are "+charge);
        }else {
            double charge=total;
            System.out.println("Charges are "+charge);
        }
    }
}
