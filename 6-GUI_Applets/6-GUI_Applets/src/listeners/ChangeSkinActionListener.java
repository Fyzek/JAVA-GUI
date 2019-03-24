package listeners;

import gui.MyJDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class ChangeSkinActionListener implements ActionListener {
    
    private LookAndFeel laf;
    private JApplet applet;

    public ChangeSkinActionListener(JApplet applet, LookAndFeel laf) {
        this.applet = applet;
        this.laf = laf;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ChangeSkinActionListener.class.getName()).log(Level.SEVERE, null, ex);
        }

        SwingUtilities.updateComponentTreeUI(applet);

    }
}
