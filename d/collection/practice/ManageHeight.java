package d.collection.practice;

import java.util.*;

public class ManageHeight{
    
    ArrayList<ArrayList<Integer>> gradeHeights ;
    
    public static void main(String[] args){
        ManageHeight mh = new ManageHeight();
        mh.setData();
        /*for(int i = 1;i<=5;i++){
            mh.printHeight(i);
        }*/
        
        int cls = 1;
        while(cls <= 5){
            mh.printAverage(cls);
            cls++;
        }
    }
    
    public void setData(){
        gradeHeights = new ArrayList<ArrayList<Integer>>();
        gradeHeights.add(new ArrayList<>(Arrays.asList(new Integer[]{170,180,173,175,177})));
        gradeHeights.add(new ArrayList<>(Arrays.asList(new Integer[]{160,165,167,186})));
        gradeHeights.add(new ArrayList<>(Arrays.asList(new Integer[]{157,177,187,176})));
        gradeHeights.add(new ArrayList<>(Arrays.asList(new Integer[]{173,182,181})));
        gradeHeights.add(new ArrayList<>(Arrays.asList(new Integer[]{170,180,165,177,172})));
    }
    
    public void printHeight(int classNo){
        try{
            if(classNo >= gradeHeights.size() && classNo < 0) throw new Exception();
            
            System.out.println("Class No. : " + classNo);
            for(Integer elem : gradeHeights.get(classNo-1)){
                System.out.println(elem);
            }   
        }catch (Exception e){
            System.out.println(classNo + " is invalid");
        }
    }
    
    
    public void printAverage(int classNo){
        try{
            if(classNo >= gradeHeights.size() && classNo < 0) throw new Exception();
            double avg = 0;   
            System.out.println("Class No. : " + classNo);
            for(Integer elem : gradeHeights.get(classNo-1)){
                avg += elem;
            }   
            
            System.out.println(avg/(gradeHeights.get(classNo-1).size() * 1.0));
        }catch (Exception e){
            System.out.println(classNo + " is invalid");
        }
    }
    
    
}