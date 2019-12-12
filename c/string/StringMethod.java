package c.string;

public class StringMethod{
    public static void main(String[] args){
        String text = "Java technology is both a programming language and a platform";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a',20));
        System.out.println(text.indexOf("a ",20));
        System.out.println(text.indexOf('z'));
        
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a',20));
        System.out.println(text.lastIndexOf("a ",20));
        System.out.println(text.lastIndexOf('z'));
        
        System.out.println(text.charAt(24));
        System.out.println(text.charAt(5));
        
        char[] arr = text.toCharArray();
        
        for(char c : arr){
            System.out.print(c+" ");
        }
        System.out.println();
            
        System.out.println(String.copyValueOf(arr));
        String subText = text.substring(5);
        String subText2 = text.substring(5,6);
        System.out.println(subText);
        
        String[] splitArray = text.split(" ");
        for(String temp : splitArray){
            System.out.println(temp);
        }
        
        String[] strings = new String[]{
            "a","b ","   c","d    ","e   f","   "
        };
        
        for(String str : strings){
            System.out.println(str.trim());
        }
        
        String txt = "The String class represents character strings";
        System.out.println(txt.replace('s','z'));
        System.out.println(txt);
        System.out.println(txt.replace("tring","trike"));
        System.out.println(txt.replaceAll(" ","|"));
        System.out.println(txt.replaceFirst(" ","|"));
        
        text = "제 이름은 %s입니다 지금까지 %d권의 책을 썼고," + "하루에 %f %%의 시간을 책을 쓰는데 사용하고 있습니다";
        String realText = String.format(text,"이상민",7,10.5);
        System.out.println(realText);
        
        String nullString = null;
        String temp = nullString.toString()+"abc";
        System.out.println(temp);
        System.out.println(String.valueOf(nullString));
    }
}