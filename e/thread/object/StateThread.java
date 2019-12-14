package e.thread.object;

public class StateThread extends Thread{
    private Object monitor;
    public StateThread(Object monitor){
        this.monitor = monitor;
    }
    
    public void run(){
        try{
            for(int i = 0;i<1e4;i++){
                String a = "A";
            }
            
            synchronized(monitor){
                monitor.wait();
            }
            
            System.out.println(getName() + "is notified");
            Thread.sleep(1000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}