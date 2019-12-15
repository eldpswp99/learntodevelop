package e.io.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

public class FileSizeSummary {
    public static void main(String[] args){
        FileSizeSummary sample = new FileSizeSummary();
        String path = "/workspace/javalearn/text";
        String pathAll = "/workspace/javalearn";
        
        System.out.println(sample.convertFileLength(sample.allFileSize(path)));
        System.out.println(sample.convertFileLength(sample.allFileSize(pathAll)));
        
        String newpath = "/workspace/javalearn/text/a/b/c/end.txt";
        File newfile = new File(newpath);
        System.out.println(newfile.mkdirs());
    }
    
    public long allFileSize(String path){
        long ret = 0;
        ArrayList<File> flist = new ArrayList<>();
        allFiles(flist,path);
        
        for(File f : flist){
            if(f.isFile()){
                ret += f.length();    
            }
        }
        
        return ret;
    }
    
    public void allFiles(ArrayList<File> flist,String path){
        File[] farr = new File(path).listFiles();
        
        if(farr == null) return;
        
        for(File f : farr){
            allFiles(flist,f.getAbsolutePath());
        }
        
        flist.addAll(Arrays.asList(farr));
    }
    
    public long printFileSize(String dirName){
        File dir = new File(dirName);
        long sum = 0;
        
        if(dir.isDirectory()){
            File[] fileList = dir.listFiles();
            for(File file : fileList){
                if(file.isFile()){
                    sum += file.length();
                    System.out.println(file.getAbsolutePath() + " size = " + file.length());
                }else{
                    long templength = allFileSize(file.getAbsolutePath());
                    sum += templength;
                    System.out.println(file.getAbsolutePath() + " size = " + templength);
                }
            }
        }
        
        return sum;
    }
    
    private String convertFileLength(long fileLength){
        final long K = 1024L;
        
        if(fileLength < 0) return null;
        DecimalFormat fmt = new DecimalFormat("0.##");
        
        if(fileLength <=K){
            return fmt.format(fileLength) + " b";
        }else if(fileLength <=K*K){
            return fmt.format(fileLength*1.0/K) + " kb";
        }else if(fileLength <=K*K*K){
            return fmt.format(fileLength*1.0/(K*K)) + " mb";
        }else{
            return fmt.format(fileLength*1.0/(K*K*K)) + " gb";
        } 
    }
}
