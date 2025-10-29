import java.util.*;
class InvalidPinException extends Exception{
    public InvalidPinException(String msg)
{
 super(msg);
}
}
public class atmmachine{
    public static void checkPIN(String pin)
    throws InvalidPinException{
        if(pin.length()!=4){
            throw new InvalidPinException ("pin must be exactly 4 digits");
        }
        System.out.println("pin accepted access granted");
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your 4 digit pin");
        String pin = sc.nextLine();
        try{
            checkPIN(pin);
        }
        catch(InvalidPinException e){
            System.out.println("Error:"+e.getMessage());
        }
        
    }
    
}
