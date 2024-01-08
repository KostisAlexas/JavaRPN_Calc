import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button6Handler implements ActionListener
{
    public Button6Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton6) {
        CalculatorGui.op.addDigit('6');
    }
}
