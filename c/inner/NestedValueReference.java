package c.inner;

public class NestedValueReference{
    static class StaticNested{
        private int staticNestedInt = 99;
    }
    class Inner{
        private int innerValue = 100;
    }
    public void setValue(int value){
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
    
}