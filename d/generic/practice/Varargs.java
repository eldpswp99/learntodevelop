package d.generic.practice;

import java.util.concurrent.*;

public class Varargs{
    public static void main(String[] args){
        pickTwo("좋은","빠른","저렴한");
    }
    
    static <T> void toArray(T... args){
        System.out.println(args.getClass());
        
        return;
    }
    
    static <T> void pickTwo(T a,T b,T c){
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        
        toArray(a,b);
        return;
        /*   switch(ThreadLocalRandom.current().nextInt(3)){
            case 0: return toArray(a,b);
            case 1: return toArray(a,c);
            case 2: return toArray(b,c);
                
        }*/
        //throw new AssertionError();
    }
}