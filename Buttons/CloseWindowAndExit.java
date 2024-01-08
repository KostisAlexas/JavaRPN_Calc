import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


class CloseWindowAndExit extends WindowAdapter
{
    @Override
    public void windowClosing(final WindowEvent closeWindowAndExit) {
        System.exit(0);
    }
}
