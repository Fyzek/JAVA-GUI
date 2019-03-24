package gui;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {

    private Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
    
    public MyJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setIconImage(icon);
    }

    public MyJFrame(String title, int width, int height, Component comp) {
        this(title, width, height);
        super.getContentPane().add(comp);

    }

    public MyJFrame(String title, int width, int height, LayoutManager layout) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layout);
        super.setIconImage(icon);
    }
}
