package e.thread.sync;

public class CommonCalculate{
    private int amount;
    private int interest;
    
    Object amountLock = new Object();
    Object interestLock = new Object();
    public CommonCalculate(){
        amount = 0;
    }
    
    public void plus(int value){
        synchronized(amountLock){
            amount += value;    
        }
        
    }
    
    public void minus(int value){
        synchronized(amountLock){
            amount -= value;    
        }
    }
    
    public void addInterest(int value){
        synchronized(interestLock){
            interest += value;    
        }
    }

    public int getInterest(){
        return interest;
    }
    
    public int getAmount(){
        return amount;
    }
}