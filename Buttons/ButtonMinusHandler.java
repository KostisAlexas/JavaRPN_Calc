import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 

class ButtonMinusHandler implements ActionListener
{
    public ButtonMinusHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonMinus) {
        CalculatorGui.sub.operate();
    }
}
