import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ButtonResultPresenterHandler implements ActionListener
{
    public ButtonResultPresenterHandler() {
    }
    
    @Override
    public void actionPerformed(final ActionEvent pushingButtonResultPresenter) {
        CalculatorGui.eq.operate();
    }
}
