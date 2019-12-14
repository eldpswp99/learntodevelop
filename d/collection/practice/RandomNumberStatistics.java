package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics{
    private final int DATA_BOUNDARY = 50;
    private Hashtable<Integer,Integer> hashtable = new Hashtable<>();
    
    public static void main(String[] args){
        RandomNumberStatistics rns = new RandomNumberStatistics();
        rns.getRandomNumberStatistics();
    }
    
    public void getRandomNumberStatistics(){
        Random rand = new Random();
        
        for(int i = 0;i<5000;i++){
            putCurrentNumber(rand.nextInt(DATA_BOUNDARY+1));
        }
        
        printStatistics();
    }
    
    public void putCurrentNumber(int tempNumber){
        if(!hashtable.containsKey(tempNumber)){
            hashtable.put(tempNumber,1);
        }else{
            hashtable.put(tempNumber,hashtable.get(tempNumber)+1);
        }
    }
    
    public void printStatistics(){
        Set<Integer> kSet = hashtable.keySet();
        
        for(Integer k : kSet){
            System.out.print(k + " : " + hashtable.get(k)+"  ");
            if(k % 10 == 1) System.out.println();
        }
    }
    
}