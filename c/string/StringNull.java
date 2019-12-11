package c.string;

public class StringNull{
    public static void main(String[] args){
        StringNull sn = new StringNull();
        sn.nullCheck(null);
    }
    
    public boolean nullCheck(String text){
        if(text == null) return true;
        
        int textLength = text.length();
        System.out.println(textLength);
        
        return false;
        
    }
}