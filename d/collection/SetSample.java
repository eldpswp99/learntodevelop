package d.collection;

import java.util.*;

public class SetSample{
    public static void main(String[] args){
        SetSample sample = new SetSample();
        
        String[] cars = new String[]{
            "Tico","Sonata","BMW","Benz",
            "Lexus","Mustang","Grandeure",
            "The Beetle","Mini Cooper","i30",
            "BMW","Lexus","Carnibal","SM5",
            "SM7","SM3","Tico"
        };
        
        System.out.println(sample.getCarKinds(cars));
        
    }
    
    public int getCarKinds(String[] cars){
        if(cars == null) return 0;
        
        Set<String> set = new HashSet<String>(Arrays.asList(cars));
        
        printCarSet(set);
        return set.size();
    }
    
    public void printCarSet(Set<String> set){
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
    
}