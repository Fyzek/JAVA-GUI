package javabegin.sources;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestGUI{

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        
        MyJButton button1 = new MyJButton("Button");
    
        MyJPanel panel = new MyJPanel("Panel", 100, 100, button1);
        
        MyJFrame frame = new MyJFrame("Frame", 200, 200, panel);
  
                                
    }
   
}
