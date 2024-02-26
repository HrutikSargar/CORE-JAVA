package InheritanceExam.Question2;

public class Demo {
    Demo(){
        this(50);
        System.out.println("Default Constructor");
    }
    Demo(int x){
        this(5,44);
        System.out.println("Parameterised Constructor with 1 variable");
        System.out.println(x);
    }
    Demo(int a,int b){
        System.out.println("Parameterised Constructor ");
        System.out.println(a+" "+b);
    }
}
