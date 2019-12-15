package e.io;

import java.io.File;
import java.util.Date;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class FileSample{
    public static void main(String[] args){
        FileSample sample = new FileSample();
        String pathName = "/workspace/javalearn/text";
        File file = new File(pathName);
        file.mkdir();
    }
    
    public void checkPath(String pathName){
        File file = new File(pathName);
        System.out.println(pathName + " is exists? = " + file.exists());
    }
    
    public void makeDir(String pathName){
        File file = new File(pathName);
        System.out.println("Make : "+pathName+"result = "+file.mkdir());
    }
    
    public void checkFileMethods(String pathName){
        File file = new File(pathName);
        System.out.println(pathName+" is directory? = "+file.isDirectory());
        System.out.println(pathName+" is file? = "+file.isFile());
        System.out.println(pathName+" is hidden? = "+file.isHidden());
        
        System.out.println(pathName+" can read? = "+file.canRead());
        System.out.println(pathName+" can write? = "+file.canWrite());
        System.out.println(pathName+" can execute? = "+file.canExecute());
    }
    
    public void lastModified(String pathName){
        File file = new File(pathName);
        System.out.println(pathName + " last modified = " + ZonedDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()),ZoneId.of("Asia/Seoul")));
    }
}