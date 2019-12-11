package c.exception.practice;

public class Calculator{
    public static void main(String[] args){
        try{
            Calculator cal = new Calculator();
            cal.printDivide(1,2);
            cal.printDivide(1,0);    
        }catch(ArithmeticException e){
            System.out.println("Second value can't be zero");
        }
        
    }
    
    public void printDivide(double d1,double d2){
        if(d2 == 0) throw new ArithmeticException();
        
        double result = d1/d2;        
        System.out.println(result);
    }
}