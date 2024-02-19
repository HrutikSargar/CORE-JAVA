package Encapsulation.Employee;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1=new Employee();

        System.out.println(e1.getClass());

        System.out.print("Enter EmpId :");
        String s1= sc.next();
        e1.setEmpId(s1);

        System.out.print("Enter employee name: ");
        String name = sc.next();
        e1.setEmpName(name);

        System.out.print("Enter EmpSalary :");
        double d1= sc.nextDouble();
        e1.setEmpSalary(d1);

        System.out.print("Enter Employee age : ");
        int age= sc.nextInt();
        e1.setEmpAge(age);

        System.out.println("============================");
        e1.display();
        System.out.println("============================");

        System.out.println("Do you want to edit ? ");
        System.out.println("1: Edit Salary \t2:Edit Age");
        int choice= sc.nextInt();
        if (choice==1){
            System.out.print("Enter salary : ");
            double salary= sc.nextDouble();
            e1.setEmpSalary(salary);

            System.out.println("Emp Salary "+e1.getEmpSalary());
        }else if(choice==2){
            System.out.print("Enter age : ");
            int age1= sc.nextInt();
            e1.setEmpAge(age1);

            System.out.print("Emp Age is : "+e1.getEmpAge());
        }else {
            System.out.println("Invalid choice");
        }
    }
}
