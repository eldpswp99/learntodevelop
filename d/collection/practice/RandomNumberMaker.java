package d.collection.practice;

import java.util.*;

public class RandomNumberMaker{
    public static void main(String[] args){
        RandomNumberMaker rnm = new RandomNumberMaker();
        for(int i = 0;i<10;i++){
            System.out.println(rnm.getSixNumber());
        }
    }
    
    public HashSet<Integer> getSixNumber(){
        Random random = new Random();
        HashSet<Integer> ret = new HashSet<Integer>();
        
        while(ret.size() < 6){
            int temp = random.nextInt(45);
            ret.add(temp);
        }
        
        return ret;
    }
}