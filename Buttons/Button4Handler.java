import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button4Handler implements ActionListener
{
    public Button4Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton4) {
        CalculatorGui.op.addDigit('4');
    }
}
