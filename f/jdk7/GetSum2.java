package f.jdk7;

import java.util.concurrent.RecursiveTask;

public class GetSum2 extends RecursiveTask<Long>{
    long from,to;
    
    public GetSum2(long from,long to){
        this.from = from;
        this.to = to;
    }
    
    public Long compute(){
        long gap = to - from;
        
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("From : " + from + " To : "+to);
        
        if(gap <= 3){
            long tempSum = 0;
            for(long loop = from;loop<=to;loop++){
                tempSum+=loop;
            }
            return tempSum;
        }
        
        long middle = (from+to)/2;
        GetSum2 sumPre = new GetSum2(from,middle);
        sumPre.fork();
        GetSum2 sumPost = new GetSum2(middle+1,to);
        return sumPost.compute() + sumPre.join();
    }
}
