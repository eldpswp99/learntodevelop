package c.middle;

public class Employee{
    private String name;
    private int type;
    private long salary;
    
    public final static int owner = 1;
    public final static int manager = 2;
    public final static int designer = 3;
    public final static int architect = 4;
    public final static int developer = 5;
    
    
    public Employee(String name,int type,long salary){
        this.name = name;
        this.type = type;
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public int getType(){
        return type;
    }
    
    public long getSalary(){
        return salary;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setType(int type){
        this.type = type;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
}