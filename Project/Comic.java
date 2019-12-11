package Project;

public class Comic extends Book{
    
    public Comic(String name,int page,String author){
         super(name,page,author);
    }
    @Override
    public void setGenre()
    {
        this.genre = "Comic";
    }
}