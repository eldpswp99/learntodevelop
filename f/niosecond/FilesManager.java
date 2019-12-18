package f.niosecond;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardCopyOption;


public class FilesManager {
    
    public static void main(String[] args){
        FilesManager sample = new FilesManager();
        String fileName = "AboutThisBook.txt";
        Path fromPath = sample.writeAndRead(fileName);
        sample.copyMoveDelete(fromPath,fileName);
    }
    
    public List<String> getContents(){
        List<String> contents = new ArrayList<String>();
        contents.add("이 책은 저자의 6번째 책입니다");
        contents.add("contents 2");
        contents.add("contents 3");
        contents.add("contents 4");
        contents.add("Current Date = " + new Date());
        return contents;
    }
    
    public Path writeFile(Path path) throws Exception{
        Charset charset = Charset.forName("EUC-KR");
        List<String> contents = getContents();
        StandardOpenOption openOption = StandardOpenOption.CREATE;
        return Files.write(path,contents,charset,openOption);
    }
    
    public void readFile(Path path) throws Exception{
        Charset charset = Charset.forName("EUC-KR");
        System.out.println("Path = "+path);
        List<String> fileContents = Files.readAllLines(path,charset);
        for(String tempContents : fileContents){
            System.out.println(tempContents);
        }
        
        System.out.println();
    }
    
    public Path writeAndRead(String fileName){
        Path returnPath = null;
        try{
            Path path = Paths.get(fileName);
            returnPath = writeFile(path);
            System.out.println("File Created");
            readFile(returnPath);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return returnPath;
    }
    
    public void copyMoveDelete(Path fromPath,String fileName){
        try{
            Path toPath = fromPath.toAbsolutePath().getParent();
            
            Path copyPath = toPath.resolve("copied");
            
            
            
            if(!Files.exists(copyPath)){                
                Files.createDirectories(copyPath);
            }
            
            Path copiedFilePath = copyPath.resolve(fileName);
            StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
            System.out.println(copiedFilePath);
            
            Files.copy(fromPath,copiedFilePath,copyOption);
            
            System.out.println("======Copied File Contents========");
            readFile(copiedFilePath);
            
            Path movedFilePath = Files.move(copiedFilePath,copyPath.resolve("moved.txt"),copyOption);
           
            Files.delete(movedFilePath);
            Files.delete(copyPath);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
