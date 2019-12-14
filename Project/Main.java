package Project;

import java.io.*;

public class Main{
        
    public static void main(String[] args){
        Menu m = Menu.getInstance();
        
        try{
            m.mainMenu();       
        }catch(Exception e){
            System.out.println("Error!");
        }
        
    
    }
}