package javabegin.sources;

public class TestGUI{
    
    public static void main(String[] args) {
        
        MyJButton button1 = new MyJButton("Button");

        MyJPanel panel = new MyJPanel("Panel", 100, 100, button1);
     
        MyJFrame frame = new MyJFrame("Frame", 200, 200, panel);
                               
    }
   
}
