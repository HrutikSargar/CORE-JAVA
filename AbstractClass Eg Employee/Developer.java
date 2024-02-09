package AbstractClass.Employee;

public class Developer extends Employee{
    double hra=5000,incentives=7000;
    public Developer(int empId,String empName){
        super(empId,empName);
    }
    @Override
    void calculateSalary(double basciSal) {
        Double totalSal=basciSal+hra+incentives;
        System.out.println("Net Salary is "+totalSal);
    }
}
