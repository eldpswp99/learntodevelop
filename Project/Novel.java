package Project;

public class Novel extends Book{
    
    public Novel(String name,int page,String author){
         super(name,page,author);
    }
    
    @Override
    public void setGenre()
    {
        this.genre = "Novel";
    }
}