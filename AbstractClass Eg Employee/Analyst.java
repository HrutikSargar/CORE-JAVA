package AbstractClass.Employee;

public class Analyst extends Employee{
    double hra=8000,incentives=12000;
    public Analyst(int id,String name){
        super(id,name);
    }
    @Override
    void calculateSalary(double basciSal) {
        double netSalary=basciSal+hra+incentives;
        System.out.println("Net Salary "+netSalary);

    }
}
