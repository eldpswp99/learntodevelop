package c.string;

public class StringPractice{
    public static void main(String[] args){
        StringPractice sp = new StringPractice();
        String txt = "The String class represents character strings.";
        sp.printWords(txt);
        sp.findString(txt,"string");
        sp.findAnyCaseString(txt,"string");
        sp.countChar(txt,'s');
        sp.printContainWords(txt,"ss");
    }
    
    public void printWords(String str){
        String[] sarr = str.split(" ");
        for(String s : sarr){
            System.out.println(s);
        } 
    }
    
    public void findString(String str,String findStr){
        int idx = str.indexOf(findStr);
        if(idx != -1) System.out.println(findStr + " is appeared at " + idx);
        else System.out.println(findStr+" Doesn't exist");
    }
    
    public void findAnyCaseString(String str,String findStr){
        int idx = str.toLowerCase().indexOf(findStr.toLowerCase());
        if(idx != -1) System.out.println(findStr + " is appeared at " + idx);
        else System.out.println(findStr +" Doesn't exist");
    }
    
    public void countChar(String str,char c){
        char[] charr = str.toCharArray();
        
        int ret = 0;
        for(char ch : charr){
            if(ch == c) ret++;
        }
        
        System.out.println("char '"+c+ "' count is "+ret);
    }
    
    public void printContainWords(String str,String findStr){
        String[] sarr = str.split(" ");
        
        for(String s : sarr){
            if(s.contains(findStr)) System.out.print(s+" ");
        }
        System.out.println();
    }
}