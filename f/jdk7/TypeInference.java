package f.jdk7;

public class TypeInference {
    public static void main(String[] args){
        TypeInference type = new TypeInference();
        type.makeObjects1();
    }
    
    public void makeObjects1(){
        GenericClass<Integer> generic1 = new GenericClass<>("String");
        generic1.setValue(999);
    }
}
