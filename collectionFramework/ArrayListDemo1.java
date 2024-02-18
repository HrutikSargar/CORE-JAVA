package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class StudentData{
    ArrayList<String> data=new ArrayList<>();
    void addStudent(String name){
        data.add(name);
    }
    void UpdateStudent(int index,String name){
        if (index>=0 && index<data.size()){
            data.set(index,name);
        }else {
            System.out.println("Invalid student index");
        }
    }
    void delete(String name){
        if (data.contains(name)){
            data.remove(name);
            System.out.println("Student deleted successfully");
        }else {
            System.out.println("Invalid student name");
        }
    }
    void getSpecificStudent(int index){
        if (index>=0 && index<data.size()){
            System.out.println("Student name :"+data.get(index));
        }else {
            System.out.println("Invalid student index");
        }
    }
    void getAllStudent(){
        Iterator<String> itr= data.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//        System.out.println(data);
    }
}
public class ArrayListDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status=true;
        StudentData s1=new StudentData();

        while(status){
            System.out.println("======Options=====");
            System.out.println("1.Add Student");
            System.out.println("2.Update Student");
            System.out.println("3.Delete Student");
            System.out.println("4.Get Specific Student");
            System.out.println("5.Get All Student");
            System.out.println("6.Exit");
            System.out.println("======Options=====");

            System.out.print("Enter Choice : ");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Student name");
                    String name= sc.next();
                    s1.addStudent(name);
                    break;
                case 2:
                    System.out.println("Enter index:");
                    int index= sc.nextInt();
                    System.out.println("Enter Updated Name");
                    name =sc.next();
                    s1.UpdateStudent(index,name);
                    break;
                case 3:
                    System.out.println("Enter name ");
                    name= sc.next();
                    s1.delete(name);
                    break;
                case 4:
                    System.out.println("enter Index");
                    index= sc.nextInt();
                    s1.getSpecificStudent(index);
                    break;
                case 5:
                    s1.getAllStudent();
                    break;
                case 6:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid request");
                    break;
            }
        }

    }
}
