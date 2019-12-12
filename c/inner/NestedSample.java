package c.inner;

public class NestedSample{
    public static void main(String[] args){
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
    }
    
    public void makeStaticNestedObject(){
        OuterOfStatic.StaticNested sn = new OuterOfStatic.StaticNested();
        sn.setValue(3);
        System.out.println(sn.getValue());
        
        OuterOfStatic.StaticNested sn2 = new OuterOfStatic.StaticNested();
        sn2.setValue(5);
        System.out.println(sn2.getValue());
        System.out.println(sn.getValue());
    }
    
    public void makeInnerObject(){
        OuterOfInner ooi = new OuterOfInner();
        OuterOfInner.Inner ooii = ooi.new Inner();
        ooii.setValue(3);
        System.out.println(ooii.getValue());
    }
    
    class MagicButtonListener implements EventListener{
        public void onClick(){
            System.out.println("Magic Button Clicked");
        }
    }
    
    public void setButtonListener(){
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(new EventListener(){
            public void onClick(){
                System.out.println("Magic Button Clicked");
            }
        });
        button.onClickProcess();
    }
}