package c.exception;

public class MyException extends RuntimeException{
    public MyException(){
        super();
    }
    
    public MyException(String Message){
        super(Message);
    }
}