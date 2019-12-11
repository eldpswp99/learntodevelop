package c.string;

public class StringSample{
    public static void main(String[] args){
        StringSample ss = new StringSample();
        ss.convertUTF16();
    }
    
    public void convertUTF16(){
        try{
            String korean = "자바";
            
            byte[] arr1 = korean.getBytes();
            printByteArray(arr1);
            
            System.out.println();
            String korean2 = new String(arr1);
            System.out.println(korean2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void printByteArray(byte[] arr){
        for(byte data:arr){
            System.out.print(data +" ");
        }
        System.out.println();
    }
}