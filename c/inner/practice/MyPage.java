package c.inner.practice;

public class MyPage{
    static InputBox input;
    public static void main(String[] args){
        MyPage myp = new MyPage();
        myp.setUI();
        myp.pressKey(input.KEY_DOWN);
        myp.pressKey(input.KEY_UP);
    }
    
    public void setUI(){
        input = new InputBox(); 
        input.setKeyListener(new KeyEventListener(){
            @Override
            public void onKeyDown(){
                System.out.println("Key Down");
            }
            @Override
            public void onKeyUp(){
                System.out.println("Key Up");
            } 
        });
    }
    
    public void pressKey(int key){
        input.listenerCalled(key);
    }
}