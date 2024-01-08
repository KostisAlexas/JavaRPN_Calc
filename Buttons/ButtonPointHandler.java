import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ButtonPointHandler implements ActionListener
{
    public ButtonPointHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonPoint) {
        CalculatorGui.op.addDigit('.');
    }
}
