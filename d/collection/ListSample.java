package d.collection;

import java.util.*;

public class ListSample{
    public static void main(String[] args){
        ListSample sample = new ListSample();
        sample.checkArrayList6();
    }
    
    public void checkArrayList1(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("ArraySimple");   
    }
    
    public void checkArrayList2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add(1,"A1");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("0 ");
        list2.addAll(list);
        
        for(String s : list2){
            System.out.println(s);
        }
    }
    
    public void checkArrayList3(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        
        ArrayList<String> list2 = list;
        list.add("Ooops");
        
        for(String s : list2){
            System.out.println(s);
        }
    }
    
    public void checkArrayList4(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        int listSize = list.size();
        
        for(int i = 0;i<listSize;i++){
            System.out.println(list.get(i));
        }
    }
    
    public void checkArrayList5(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempList = new String[2]; 
        String[] strList = list.toArray(tempList);        
        
        for(String str : strList){
            System.out.println(str);                
        }
        System.out.println();
        for(String str : tempList){
            System.out.println(str);                
        }
    }
    
    public void checkArrayList6(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        
        list.set(1,"C");
      
        for(String s : list){
            System.out.println(s);
        }
    }
    
}