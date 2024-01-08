import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ButtonClearAllHandler implements ActionListener
{
    public ButtonClearAllHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonClearAll) {
        CalculatorGui.op.reset();
    }
}
