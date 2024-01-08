import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button9Handler implements ActionListener
{
    public Button9Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton9) {
        CalculatorGui.op.addDigit('9');
    }
}
