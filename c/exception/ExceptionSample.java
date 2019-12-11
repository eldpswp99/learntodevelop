package c.exception;

public class ExceptionSample{
    public static void main(String[] args){
        ExceptionSample es = new ExceptionSample();
        es.multiCatch();
    }
    
    public void arrayOutOfBounds(){
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }
    
    public void arrayOutOfBoundsTryCatch(){
        try{
            int[] intArray = new int[5];
            System.out.println(intArray[5]);    
            System.out.println("No Error Occurred");
        }catch (Exception e){
            System.err.println("Error Occurred");
        }
        System.out.println("End of func");
        
    }
    
    public void multiCatch(){
        int[] iarr = null;
        try{
            iarr = new int[5];
            iarr = null;
            System.out.println(iarr[5]);
        }/*catch(NullPointerException e){
            System.out.println("NullPointerException occurred");*/
        //}
    catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }/*catch(Exception e){
            System.out.println(iarr.length);
        }*/
        
        System.out.println("func ended");
    }

    public void finallySample(){
        int[] iarr = new int[5];
        try{
            System.out.println(iarr[4]);
        }catch(Exception e){
            System.out.println(iarr.length);
        }finally{
            System.out.println("here is finally");
        }
        System.out.println("end of func");
    }
}