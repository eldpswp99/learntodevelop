package d.lang;

import d.lang.practice.*;

public class JavaLangNumber{
    public static void main(String[] args){
        /*JavaLangNumber sample = new JavaLangNumber();
        sample.printStreamCheck();
        
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append("World");
        
        System.out.println(sb);*/
        
        NumberObjects no = new NumberObjects();
        
        System.out.println(no.parseLong("r1024"));
        System.out.println(no.parseLong("1345123512521"));
        
        no.printOtherBase(1024);
    }
    
    public void numberTypeCheck(){
        String value1 = "3";
        String value2 = "5";
        
        byte byte1 = Byte.parseByte(value1);
        byte byte2 = Byte.parseByte(value2);
        System.out.println(byte1 + byte2);
        
        Integer refInt1 = Integer.valueOf(value1);
        Integer refInt2 = Integer.valueOf(value2);
        System.out.println(refInt1 + refInt2 + "7");   
    }
    
    public void systemPropertiesCheck(){
        System.out.println("java.version ="+System.getProperty("java.version"));
        System.out.println("JAVA_HOME= " + System.getenv("JAVA_HOME"));
    }
    
    public void numberMinMaxElapsedCheck(){
        JavaLangNumber numberSample = new JavaLangNumber();
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        numberSample.numberTypeCheck();
        System.out.println("Milli second : " +(System.currentTimeMillis() - startTime));
        System.out.println("Nano second : " + (System.nanoTime() - startNanoTime));        
    }
    
    public void printStreamCheck(){
        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        System.out.println(b);
        System.out.println(s);
    }
    
    
    
}