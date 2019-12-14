package d.collection;

import java.util.*;

public class MapSample{
    public static void main(String[] args){
        MapSample sample = new MapSample();
        sample.checkConatains();   
}
    
    public void checkHashMap(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("A","a");
        System.out.println(map.get("A"));
        map.put("A","1");
        System.out.println(map.get("A"));
    }
    
    public void checkKeySet(){
        HashMap<String,String> map = new HashMap<String,String>();
        
        map.put("A","a");
        map.put("C","c");
        map.put("D","d");
        
        Set<String> keySet = map.keySet();
        for(String k : keySet){
            System.out.println(map.get(k));
        }
                
    }
    
    public void checkValues(){
        HashMap<Integer,Integer> map = new HashMap<>();
        Random rand = new Random();
        for(int i = 0;i<10;i++){
            map.put(i,i);
        }
        
        Set<Integer> keySet = map.keySet();
        for(Integer k : keySet){
            System.out.println(map.get(k));
        }
        
        Collection<Integer> val= map.values();        
        val.remove(2);
        val.remove(0);        
        
        System.out.println();
        for(Integer k : keySet){
            System.out.println(map.get(k));
        }
    }
    
    public void checkHashMapEntry(){
        HashMap<String,String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");
        
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey() +"  "+ entry.getValue());
        }
    }
    
    public void checkConatains(){
        HashMap<String,String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");
        
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("E"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("A"));
    }
}