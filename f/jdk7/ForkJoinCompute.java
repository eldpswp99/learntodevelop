package f.jdk7;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinCompute {
    
    static final ForkJoinPool mainPool = new ForkJoinPool();
    
    public static void main(String[] args){
        ForkJoinCompute sample = new ForkJoinCompute();
        sample.calculate();
    }
    
    public void calculate(){
        long from = 0;
        long to = 10;
        
        GetSum2 sum = new GetSum2(from,to);
        Long result = mainPool.invoke(sum);
        System.out.println("Total sum of "+ from +" ~ "+to + " = "+result);
    }
}
