package InheritanceExam.Question4;

public class UserAuthentication {
    void loginByContactNumber(long contactNumber,String password){
        long contact=123456;
        String pass="Hrutik";

        if (pass.equals(password) && contact==contactNumber){
            System.out.println("Welcome user ");
            System.out.println("Pass and contactNumber correct");
        }else {
            System.out.println("Invalid email amd pass");
        }
    }
    void loginByEmail(String emailadderss,String password){
        String pass="Hrutik";
        String email="hrutiksargar@gmail.com";

        if (pass.equals(password) && email.equals(emailadderss)){
            System.out.println("Welcome user ");
            System.out.println("Pass and email correct");
        }else {
            System.out.println("Invalid email amd pass");
        }
    }
}
