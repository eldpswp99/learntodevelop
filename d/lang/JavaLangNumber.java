package d.lang;

public class JavaLangNumber{
    public static void main(String[] args){
        JavaLangNumber sample = new JavaLangNumber();
        sample.numberMinMaxElapsedCheck();
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
}