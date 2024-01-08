import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class ButtonClearHandler implements ActionListener
{
    public ButtonClearHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonClear) {
        CalculatorGui.op.reset();
    }
}
