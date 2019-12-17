package f.number;

public class JDK7numbers {
    public static void main(String[] args){
        JDK7numbers numbers = new JDK7numbers();
        numbers.jdk7();   
    }
    
    public void jdk7(){
        int binaryVal = 0b100_0101_0010;
        int decVal = 1106;
        int million = 1_000_000;
        int octVal = 02122;
        int hexVal = 0x452;

        System.out.println(million);
        System.out.println(binaryVal);
        System.out.println(decVal);
        System.out.println(octVal);
        System.out.println(hexVal);
    }
}
