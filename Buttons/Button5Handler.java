import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button5Handler implements ActionListener
{
    public Button5Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton5) {
        CalculatorGui.op.addDigit('5');
    }
}
