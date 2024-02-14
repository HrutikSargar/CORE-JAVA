package Castingg.Emp;

public class Employee extends Manager{
    @Override
    void managerMethod() {
        System.out.println("manager method in employee");
    }
    void empMethod(){
        System.out.println("Employee method");
    }

}
