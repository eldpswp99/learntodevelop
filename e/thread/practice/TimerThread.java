package e.thread.practice;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.time.Instant;

public class TimerThread extends Thread{
    
    int cnt = 0;
    public void run(){
        
        
        Timer timer = new Timer();
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Seoul")); 
        timer.scheduleAtFixedRate(new TimerTask(){
        
        
            @Override
            public void run(){
                
                printCurrentTime();
                cnt++;
                
                if(cnt >= 10) timer.cancel();
            }
        },new Date((System.currentTimeMillis()) / 1000L * 1000L + 1000L),1000L);
            
       
        
    }
    
    public void printCurrentTime(){
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Seoul")) + "  " + System.currentTimeMillis());    
    }
}