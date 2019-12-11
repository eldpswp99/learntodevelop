package Project;

public class Essay extends Book{
    
    public Essay(String name,int page,String author){
         super(name,page,author);
    }
    @Override
    public void setGenre()
    {
        this.genre = "Essay";
    }
}