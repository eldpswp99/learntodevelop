package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread{
    
    public void run(){
        try{
            for(int i = 0;i<10;i++){
            printCurrentTime();
            Thread.sleep(1000);
            }        
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        
        
    }
    
    public void printCurrentTime(){
        Date date = new Date();
        System.out.println(date + "  " + System.currentTimeMillis());    
    }
}