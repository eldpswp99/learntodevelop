package d.lang.practice;

public class NumberObjects{
    public long parseLong(String data){
        long ret = -1;
        
        try{
            ret = Long.parseLong(data);
        }catch(Exception e){
            System.out.println(data + " is not a number");
            return -1;
        }
        
        return ret;
    }
    
    public void printOtherBase(long value){
        System.out.println("Decimal : " + value);
        System.out.println("Binary : " + Long.toBinaryString(value));
        System.out.println("Hex : " + Long.toHexString(value));
        System.out.println("Octal : " + Long.toOctalString(value));
    }
}