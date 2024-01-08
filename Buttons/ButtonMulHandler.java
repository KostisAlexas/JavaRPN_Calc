import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 

class ButtonMulHandler implements ActionListener
{
    public ButtonMulHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonMul) {
        CalculatorGui.mul.operate();
    }
}
