import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button2Handler implements ActionListener
{
    public Button2Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton2) {
        CalculatorGui.op.addDigit('2');
    }
}
