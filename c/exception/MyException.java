package c.exception;

public class MyException extends Exception{
    public MyException(){
        super();
    }
    
    public MyException(String Message){
        super(Message);
    }
}