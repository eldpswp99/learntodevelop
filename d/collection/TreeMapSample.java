package d.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample{
    public static void main(String[] args){
        TreeMapSample sample = new TreeMapSample();
        sample.checkTreeMap();
    }
    
    public void checkTreeMap(){
        TreeMap<String,String> map = new TreeMap<String,String>();
        map.put("A","a");
        map.put("가","b");
        map.put("1","c");
        map.put("a","d");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}