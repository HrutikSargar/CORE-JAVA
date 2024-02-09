package AbstractClass.Employee;

public abstract class Employee {
    int empId;
    String empName;

    public Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }
    void display(){
        System.out.println("Emp Id is "+empId);
        System.out.println("Emp Name is "+empName);
    }
    abstract void calculateSalary(double basciSal);
}
