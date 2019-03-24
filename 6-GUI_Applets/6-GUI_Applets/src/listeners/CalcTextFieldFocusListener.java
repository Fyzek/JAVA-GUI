package listeners;

import java.awt.event.FocusEvent;
import gui.MyJTextField;
import gui.TestGUI;
import java.awt.Color;
import java.awt.event.FocusListener;

public class CalcTextFieldFocusListener implements FocusListener {

    private MyJTextField field;

    public CalcTextFieldFocusListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(TestGUI.INPUT_CHISLO)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(TestGUI.INPUT_CHISLO);
            field.setForeground(Color.GRAY);
        }
    }
}
