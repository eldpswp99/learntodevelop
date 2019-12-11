package Project;

import java.io.*;

public abstract class Book{
    protected String name;
    protected String author;
    protected int page;
    protected String genre;
    
    public Book(String name,int page,String author){
        this.name = name;
        this.page = page;
        this.author = author;
        setGenre();
    }
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public int getPage(){
        return this.page;
    }
    
    public void setPage(int page){
        this.page = page;
    }
    
    public String getGenre(){
        return genre;
    }
    
    abstract void setGenre();
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Book){
            Book bk = (Book)obj;
            
            return (this.name.equals(bk.getName())) && (page == bk.getPage()) && (this.author.equals(bk.getAuthor()));
        }
        
        return false;
    }
                
}