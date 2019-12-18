package f.jdk8;

public class DefaultImplementedChild implements DefaultStaticInterface{
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public int getSince(){
        return since;
    }
}
