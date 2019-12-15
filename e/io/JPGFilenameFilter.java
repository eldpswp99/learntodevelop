package e.io;

import java.io.FilenameFilter;
import java.io.File;

public class JPGFilenameFilter implements FilenameFilter{
    @Override
    public boolean accept(File file,String fileName){

        if(fileName.endsWith(".jpg")) return true;
        return false;
    }
}