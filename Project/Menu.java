package Project;

import java.io.*;
import java.util.*;

public class Menu{
    private static Menu m = new Menu();
    private BufferedReader br;
    private StringTokenizer st;
    private BookData bd = new BookData();
    
    private Menu(){
        
    }
    
    public static Menu getInstance(){
        return m;
    }
    
    public void mainMenu() throws IOException{
        
        while(true){
            System.out.println();
            System.out.println("--------------------");
            System.out.println("1.new Book");
            System.out.println("2.delete Book");
            System.out.println("3.search Book");
            System.out.println("4.print Book");
            System.out.println("0.Quit");
            System.out.print("Input :");
            
            int input = -1;
            
            br = new BufferedReader(new InputStreamReader(System.in));
            
            try{
                input = Integer.parseInt(br.readLine());    
            } catch(Exception e){
                System.out.println("ERROR");
                continue;
            }
            
            switch(input){
                case 1 :
                    newBook();
                    break;
                case 2: 
                    delBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4: 
                    printBook();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("INVALID INPUT");
                    break;
            }
        }
    }
    
    private void newBook() throws IOException{
        
         System.out.println("1.new Book");
         System.out.println("-------------");
         Book bk = BookCreate.getInstance();
         
         if(bk.getName() == null){
             System.out.println("INVALID INPUT");
             return;
         }
             
         bd.addBook(bk);
    }
    
    private Boolean delBook() throws IOException{
         System.out.println("2.delete Book");
         System.out.println("-------------");
         Book bk = BookCreate.getInstance();
         
         if(bk.getName() == null){
             System.out.println("INVALID INPUT");
             return false;
         }
             
         if(!bd.delBook(bk)){
             System.out.println("NO BOOK EXIST");
             return false;
         }
        
         return true;
    }
    
    private void searchBook() throws IOException{
        System.out.println("3.search Book");
        System.out.println("-------------");
    
        System.out.print("name to find: ");
        
        String name = br.readLine();
        ArrayList<Integer> ret = bd.searchBook(name);
        
        if(ret == null){
            System.out.println("NO BOOK EXIST");
        }
        else{
            System.out.println(ret.size() + "Books Found");
            System.out.println("Book index");
            for(int idx : ret){
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
    
    public void printBook() throws IOException{
        System.out.println("4.print Book");
        System.out.println("-------------");
        
        int from,to;
        System.out.print("from :");
        from = Integer.parseInt(br.readLine());
        System.out.print("to :");
        to = Integer.parseInt(br.readLine());
        
        if(from > to || from >= bd.getBcnt()){
            System.out.println("INVALID INPUT");
        }
        
        bd.printBook(from,to);
    }
}