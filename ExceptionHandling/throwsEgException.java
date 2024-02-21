package ExceptionHandling;
/*
* throws ===> it is mainly used for DECLARING  an exception */
public class throwsEgException {
    public static void main(String[] args) {
        System.out.println("Main Started");
       try{
           C();
       }catch(ArithmeticException e){
           System.out.println(e);
       }
        System.out.println("Main Ended");

    }
    public static void A() throws ArithmeticException {  //use of THROWS keyword
        System.out.println("A Started ");
       try{
           int a=5/0;
       }catch(ArithmeticException e){
           System.out.println(e);
       }
        System.out.println("A Ended");
    }
    public static void B()throws ArithmeticException {
        System.out.println("B Started ");
       A();
        System.out.println("B Ended");
    }
    public static void C()throws ArithmeticException {
        System.out.println("C Started ");
       B();
        System.out.println("C Ended");
    }

}
