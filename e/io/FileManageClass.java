package e.io;

import java.io.File;
import java.io.IOException;

public class FileManageClass{
    public static void main(String[] args){
        FileManageClass sample = new FileManageClass();
        String pathName = "/workspace/javalearn/text";
        String fileName = "test.txt";
        //sample.checkFile(pathName,fileName);
        
        File root = new File("/");
        String[] direc = root.list();
        try{
            for(String elem : direc){
            System.out.println(elem);
            }    
        }catch(Exception ie){
            ie.printStackTrace();
        }
        
    }
    
    public void checkFile(String pathName,String fileName){
        File file = new File(pathName,fileName);
        try{
            System.out.println("Create result = "+file.createNewFile());
            getFileInfo(file);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void getFileInfo(File file) throws IOException{
        System.out.println("Absolute path = "+file.getAbsolutePath());
        System.out.println("Absolute file = "+file.getAbsoluteFile());
        System.out.println("Canonical path = "+file.getCanonicalPath());
        System.out.println("Canonical file = "+file.getCanonicalFile());
        
        System.out.println("Name = " + file.getName());
        System.out.println("Path = " + file.getPath());
        System.out.println("Parent Path = " + file.getParent());
    }
}