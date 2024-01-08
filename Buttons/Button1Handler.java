import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Button1Handler implements ActionListener
{
    public Button1Handler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButton1) {
        CalculatorGui.op.addDigit('1');
    }
}
