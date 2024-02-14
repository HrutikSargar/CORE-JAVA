package Castingg.Emp;

public class MainApp {
    public static void main(String[] args) {

        //up-casting
        Ceo c1=new Manager();
        Manager m1=new Employee();


        //down-casting
        Manager m2=(Manager) c1;
        Employee e2=(Employee) m1;


        m1.managerMethod();
        m1.ceoMethod();

        c1.ceoMethod();

        m2.managerMethod();
        m2.ceoMethod();

        e2.ceoMethod();
        e2.managerMethod();
        e2.empMethod();






    }
}
