import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button0Handler implements ActionListener
{
    public Button0Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton0) {
        CalculatorGui.op.addDigit('0');
    }
}
