package c.exception;

public class ThrowableSample{
    public static void main(String[] args) {
        ThrowableSample ts = new ThrowableSample();
        
        ts.throwException(13);
        try{
            ts.throwException(13);
        }catch(MyException e){
            e.printStackTrace();
        }
    }
    
    public void throwException(int number) throws NullPointerException{
        try{
            if(number > 12){
                throw new MyException("Number is over than 12");
            }    
        }catch(MyException e){
            System.out.println("!");
            e.printStackTrace();   
        }
    }
}