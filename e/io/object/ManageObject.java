package e.io.object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ManageObject {
    public static void main(String[] args){
        ManageObject manager = new ManageObject();
        String fullPath = "/workspace/javalearn/text/serial.obj";
        SerialDTO dto = new SerialDTO("GodOfJavaBook",1,true,100);
        manager.saveObject(fullPath,dto);
        manager.loadObject(fullPath);
    }
    
    public void saveObject(String fullPath,SerialDTO dto){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try{
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
            System.out.println("Write Success");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(oos != null){
                try{
                    oos.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(fos != null){
                try{
                    fos.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void loadObject(String fullPath){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try{
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            SerialDTO dto = (SerialDTO)ois.readObject();
            System.out.println(dto);
            System.out.println("Read Success");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(ois != null){
                try{
                    ois.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(fis != null){
                try{
                    fis.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
