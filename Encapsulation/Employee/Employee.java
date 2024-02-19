package Encapsulation.Employee;

public class Employee {
    private String empId;
    private String empName;
    private double empSalary;
    private int empAge;

    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        if (empId.substring(0,3).contains("QSP")){
            this.empId = empId;
        }else {
            System.out.println("Invalid EmpId");
        }
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
       if (empName.length()>=2){
           this.empName = empName;
       }else {
           System.out.println("Invalid Name");
       }
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
       if (empSalary>=10000 && empSalary<=50000){
           this.empSalary = empSalary;
       }else {
           System.out.println("Invalid salary");
       }
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
       if (empAge >=25 && empAge<=35){
           this.empAge = empAge;
       }else {
           System.out.println("Invalid Age");
       }
    }
    public void display(){
        System.out.println("EmpID :" +this.empId);
        System.out.println("EmpName :"+this.empName);
        System.out.println("EmpSalary :"+this.empSalary);
        System.out.println("EmpAge :"+this.empAge);
    }


}
