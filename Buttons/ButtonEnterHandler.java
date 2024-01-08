import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class ButtonEnterHandler implements ActionListener
{
    public ButtonEnterHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonEnter) {
        CalculatorGui.op.complete();
    }
}
