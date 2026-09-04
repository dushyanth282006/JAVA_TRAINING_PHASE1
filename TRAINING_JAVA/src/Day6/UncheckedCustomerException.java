package Day6;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class UncheckedCustomerException {
    static void customerRegister(int age) throws InvalidAgeException{
        if (age<10){
            throw new InvalidAgeException("Not eligible for liscence");
        } 
    }

    public static void main(String[]args){
        try{
            customerRegister(17);
        }catch (InvalidAgeException e){
        System.out.println("Exception:"+e.getMessage());
        }
        System.out.println("Go to next page");
    }
}