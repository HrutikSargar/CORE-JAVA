package ExceptionHandling.CustomException;

public class InvalidEmailException extends RuntimeException{
   public  InvalidEmailException(String message){
        super(message);
    }

}
