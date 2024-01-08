import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ButtonBackSpaceHandler implements ActionListener
{
    public ButtonBackSpaceHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonBackSpace) {
        CalculatorGui.op.deleteLastDigit();
    }
}
