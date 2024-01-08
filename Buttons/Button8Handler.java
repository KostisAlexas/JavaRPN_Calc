import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button8Handler implements ActionListener
{
    public Button8Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton8) {
        CalculatorGui.op.addDigit('8');
    }
}
