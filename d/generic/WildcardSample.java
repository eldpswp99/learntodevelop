package d.generic;

public class WildcardSample{
    
    private String name;
    
    public WildcardSample(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public static void main(String[] args){
        WildcardSample sample = new WildcardSample("Sample");
        sample.callGenericMethod();
    }
    
    public void callWildCardMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }
    
    public void wildcardStringMethod(WildcardGeneric<?> c){
        Object value = c.getWildcard();
        System.out.println(value);
    }
    
    public void callBoundedWildcardMethod(){
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Bus("1142"));
        boundedWildcardMethod(wildcard);
    }
    
    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c){
        Car value = c.getWildcard();
        System.out.println(value);
    }
    
    public void callGenericMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMethod(wildcard,"Data");
    }
    
    public <T> void genericMethod(WildcardGeneric<T> c,T addValue){
        System.out.println(this.getName());
        
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }
}