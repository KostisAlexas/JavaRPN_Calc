import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ButtonPlusHandler implements ActionListener
{
    public ButtonPlusHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonPlus) {
        CalculatorGui.add.operate();
    }
}
