package e.io;

import java.io.File;

public class FileFilterSample {
    public static void main(String[] args){
        FileFilterSample sample = new FileFilterSample();
        String pathName = "/workspace/javalearn/text";
        sample.checkList(pathName);
    }
    
    public void checkList(String pathName){
        try{
            File file = new File(pathName);
            //File[] mainFileList = file.listFiles();
            File[] mainFileList = file.listFiles(new JPGFileFilter());
            
            for(File felem: mainFileList){
                System.out.println(felem.getName());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
