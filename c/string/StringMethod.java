package c.string;

public class StringMethod{
    public static void main(String[] args){
        StringMethod sm = new StringMethod();
        
        String address[] = new String[]{"서울시 창동","경기도 하남 공장","서울시 도봉구 개봉동"};
        
        int scnt = 0; int ecnt = 0;
        
        String startText = "서울시";
        String endText = "동";
        
        for(String str : address){
            if(str.startsWith(startText)) scnt++;
            if(str.endsWith(endText)) ecnt++;
            
            if(str.contains("하남")){
                System.out.println(str);
            }
        }
        
        System.out.println(scnt);
        System.out.println(ecnt);
    }
}