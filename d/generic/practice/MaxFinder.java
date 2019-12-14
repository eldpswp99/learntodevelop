package d.generic.practice;

public class MaxFinder{
    public static void main(String[] args){
        MaxFinder mf = new MaxFinder();
        mf.testGetMax();
        mf.testGetMin();
    }
    
    
    public void testGetMax(){
        System.out.println(getMax(1,2,3));
        System.out.println(getMax(3,1,2));
        System.out.println(getMax(2,3,1));
        System.out.println(getMax("a","b","c"));
        System.out.println(getMax("b","c","a"));
        System.out.println(getMax("a","b","c"));
    }
    
    public <T extends Comparable<T>> T getMax(T... a){
        T maxT = a[0];
        for(T tempT: a){
            if(maxT.compareTo(tempT) < 0) maxT = tempT; 
        }
        
        return maxT;
    }
    
     public void testGetMin(){
        System.out.println(getMin(1,2,3));
        System.out.println(getMin(3,1,2));
        System.out.println(getMin(2,3,1));
        System.out.println(getMin("a","b","c"));
        System.out.println(getMin("b","c","a"));
        System.out.println(getMin("a","b","c"));
    }
    
    public <T extends Comparable<T>> T getMin(T... a){
        T minT = a[0];
        for(T tempT: a){
            if(minT.compareTo(tempT) > 0) minT = tempT; 
        }
        
        return minT;
    }
}