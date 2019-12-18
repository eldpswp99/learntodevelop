package f.jdk8;

public class LambdaSample {
    public static void main(String[] args){
        LambdaSample sample = new LambdaSample();
        sample.runCommonThreadLambda();
    }
    
    private void calculateClassic(){
        Calculate calculate = new Calculate(){
            @Override
            public int operation(int a,int b){
                return a+b;
            }
        };
        System.out.println(calculate.operation(1,2));
    }
    
    private void calculateLambda(){
        Calculate add = (a,b)->a+b;
        System.out.println(add.operation(1,2));
        Calculate subtract = (a,b)->a-b;
        System.out.println(subtract.operation(1,2));
    }
    
    private void runCommonThread(){
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
    }
    
    private void runCommonThreadLambda(){
        Runnable runnable = ()->{System.out.println(Thread.currentThread().getName());};
        new Thread(runnable).start();
    }
}
