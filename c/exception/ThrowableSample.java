package c.exception;

public class ThrowableSample{
    public static void main(String[] args) {
        ThrowableSample ts = new ThrowableSample();
        ts.throwException(13);            
        ts.throwException(13);            
    }
    
    public void throwException(int number) throws NullPointerException{
        
        if(number > 12){
            throw new NullPointerException("Number is over than 12");
        }
        
        System.out.println("number is" + number);
    }
}