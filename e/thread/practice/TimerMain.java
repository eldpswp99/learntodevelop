package e.thread.practice;

public class TimerMain{
    public static void main(String[] args){
        TimerThread timerthread = new TimerThread();
        timerthread.start();
    }
}