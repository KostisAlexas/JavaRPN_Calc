import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class ButtonDivHandler implements ActionListener
{
    public ButtonDivHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonDiv) {
        CalculatorGui.div.operate();
    }
}
