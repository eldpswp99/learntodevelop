package Project;

import java.io.*;

public class BookCreate{
    public static Book getInstance() throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String n;
        int p;
        String a;
        int g;
        
        System.out.print("Book Name :");
        n = br.readLine();       
        System.out.print("Book Page :");
        p = Integer.parseInt(br.readLine());
        System.out.print("Author of the Book :");
        a = br.readLine();
        System.out.println("Genre of the Book");
        System.out.println("1.Comic");
        System.out.println("2.Essay");
        System.out.println("3.Novel");
        g = Integer.parseInt(br.readLine());
        
        switch(g){
            case 1:
                return new Comic(n,p,a);
            case 2:
                return new Essay(n,p,a);
            case 3:
                return new Novel(n,p,a);
            default:
                return new Comic(null,-1,null); 
        }
    }
}