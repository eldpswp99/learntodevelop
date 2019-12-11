package Project;

import java.util.*;

public class BookData{
    private ArrayList<Book> arr = new ArrayList<Book>();  
    private HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
    private int bcnt = 0;
    
    public void addBook(Book bk){
        arr.add(bk);
        if(map.containsKey(bk.getName())){
            map.get(bk.getName()).add(bcnt);
        }
        else{
            map.put(bk.getName(),new ArrayList<Integer>());
            map.get(bk.getName()).add(bcnt);
        }
        bcnt++;
    }
        
    public Boolean delBook(Book bk){
        System.out.println(bk.getName());
        System.out.println(bk.getPage());
        System.out.println(bk.getAuthor());
        System.out.println(bk.getGenre());
        
        return arr.remove(bk);
    }
    
    public Boolean delBook(int idx){
        if(idx >= 0 && idx < bcnt){
            arr.remove(idx);
            bcnt--;
            return true;
            
        }
        
        return false;
    }
    
    public ArrayList<Integer> searchBook(String name){
        return map.get(name);
    }
    
    
    public int getBcnt(){
        return bcnt;
    }
    
    public void printBook(int s,int e){
        for(int i = s;i<=Math.min(e,bcnt-1);i++)
        {
            Book bk = arr.get(i);
            
            System.out.println("Name : " +bk.getName());
            System.out.println("Author : " +bk.getAuthor());
            System.out.println("Page : " +bk.getPage());
            System.out.println("Genre : " +bk.getGenre());
            System.out.println();
            if(i == bcnt-1) System.out.println("end reached");
        }
    }
}