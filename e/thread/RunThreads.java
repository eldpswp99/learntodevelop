package e.thread;

public class RunThreads{
    public static void main(String[] args){
        RunThreads sample = new RunThreads();
        sample.runCommonThread();
        
    }
    
    public void runBasic(){
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();
        
        ThreadSample thread = new ThreadSample();
        thread.start();
        System.out.println("RunThreads.runBasic() method ended");
    }
    
    public void endless(){
        EndlessThread thread = new EndlessThread();
        thread.start();
    }
    
    public void runCommonThread(){
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}