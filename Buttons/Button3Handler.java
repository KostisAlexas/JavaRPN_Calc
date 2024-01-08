import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button3Handler implements ActionListener
{
    public Button3Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton3) {
        CalculatorGui.op.addDigit('3');
    }
}
