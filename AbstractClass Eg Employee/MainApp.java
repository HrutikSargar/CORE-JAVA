package AbstractClass.Employee;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of Empoyees : ");
        Employee[] e1 =new Employee[sc.nextInt()];

        for (int a=0;a< e1.length;a++) {
            System.out.println("Enter Employee Id : ");
            int id = sc.nextInt();
            System.out.println("Enter Employee Name ");
            String name = sc.next();
            System.out.println("Enter Designation ");
            System.out.println("1:Developer\n2:Analyst");
            int choice = sc.nextInt();
            if (choice == 1) {
                e1[a] = new Developer(id, name);//upcasting

            } else if (choice == 2) {
                e1[a] = new Analyst(id, name);//upcasting
            } else
                System.out.println("Invalid Choice");
            System.out.println("==========================");
        }
        System.out.println("==============================");
        for (int a=0;a< e1.length;a++){
            System.out.print("Enter salary of "+e1[a].empId+":"+e1[a].empName+"\t");
            double salary= sc.nextDouble();
            e1[a].display();
            e1[a].calculateSalary(salary);
            System.out.println("===========================");
        }
    }
}
