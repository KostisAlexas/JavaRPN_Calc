import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button7Handler implements ActionListener
{
    public Button7Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton7) {
        CalculatorGui.op.addDigit('7');
    }
}
