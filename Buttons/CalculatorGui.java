import java.awt.event.WindowListener;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Frame;


public class CalculatorGui extends Frame
{
    public static Operand op;
    public static Adder add;
    public static Subtracter sub;
    public static Multiplier mul;
    public static Divider div;
    public static ResultPresenter eq;
    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button buttonPlus;
    public Button buttonMinus;
    public Button buttonMul;
    public Button buttonDiv;
    public Button buttonResultPresenter;
    public Button buttonEnter;
    public Button buttonBackSpace;
    public Button buttonClear;
    public Button buttonClearAll;
    public Button buttonPoint;
    public static Frame window;
    public static TextField display;
    
    public CalculatorGui(final Operand op, final Adder add, final Subtracter sub, final Multiplier mul, final Divider div, final ResultPresenter eq) {
        CalculatorGui.op = op;
        CalculatorGui.add = add;
        CalculatorGui.sub = sub;
        CalculatorGui.mul = mul;
        CalculatorGui.div = div;
        CalculatorGui.eq = eq;
        (CalculatorGui.window = new Frame("CALCULATOR Exer8 V2")).setLayout(null);
        CalculatorGui.window.setFont(new Font("Arial", 0, 14));
        CalculatorGui.window.setBackground(Color.WHITE);
        (this.button0 = new Button("0")).setBounds(64, 265, 35, 28);
        this.button0.setFont(new Font("Arial", 0, 14));
        this.button0.setForeground(Color.blue);
        this.button0.addActionListener(new Button0Handler());
        CalculatorGui.window.add(this.button0);
        (this.button1 = new Button("1")).setBounds(64, 232, 35, 28);
        this.button1.setFont(new Font("Arial", 0, 14));
        this.button1.setForeground(Color.blue);
        this.button1.addActionListener(new Button1Handler());
        CalculatorGui.window.add(this.button1);
        (this.button2 = new Button("2")).setBounds(104, 232, 35, 28);
        this.button2.setFont(new Font("Arial", 0, 14));
        this.button2.setForeground(Color.blue);
        this.button2.addActionListener(new Button2Handler());
        CalculatorGui.window.add(this.button2);
        (this.button3 = new Button("3")).setBounds(144, 232, 35, 28);
        this.button3.setFont(new Font("Arial", 0, 14));
        this.button3.setForeground(Color.blue);
        this.button3.addActionListener(new Button3Handler());
        CalculatorGui.window.add(this.button3);
        (this.button4 = new Button("4")).setBounds(64, 199, 35, 28);
        this.button4.setFont(new Font("Arial", 0, 14));
        this.button4.setForeground(Color.blue);
        this.button4.addActionListener(new Button4Handler());
        CalculatorGui.window.add(this.button4);
        (this.button5 = new Button("5")).setBounds(104, 199, 35, 28);
        this.button1.setFont(new Font("Arial", 0, 14));
        this.button5.setForeground(Color.blue);
        this.button5.addActionListener(new Button5Handler());
        CalculatorGui.window.add(this.button5);
        (this.button6 = new Button("6")).setBounds(144, 199, 35, 28);
        this.button6.setFont(new Font("Arial", 0, 14));
        this.button6.setForeground(Color.blue);
        this.button6.addActionListener(new Button6Handler());
        CalculatorGui.window.add(this.button6);
        (this.button7 = new Button("7")).setBounds(64, 166, 35, 28);
        this.button7.setFont(new Font("Arial", 0, 14));
        this.button7.setForeground(Color.blue);
        this.button7.addActionListener(new Button7Handler());
        CalculatorGui.window.add(this.button7);
        (this.button8 = new Button("8")).setBounds(104, 166, 35, 28);
        this.button8.setFont(new Font("Arial", 0, 14));
        this.button8.setForeground(Color.blue);
        this.button8.addActionListener(new Button8Handler());
        CalculatorGui.window.add(this.button8);
        (this.button9 = new Button("9")).setBounds(144, 166, 35, 28);
        this.button9.setFont(new Font("Arial", 0, 14));
        this.button9.setForeground(Color.blue);
        this.button9.addActionListener(new Button9Handler());
        CalculatorGui.window.add(this.button9);
        (this.buttonEnter = new Button("ENTER")).setFont(new Font("Arial", 0, 14));
        this.buttonEnter.setBackground(Color.red);
        this.buttonEnter.setForeground(Color.white);
        this.buttonEnter.setBounds(204, 100, 56, 28);
        this.buttonEnter.addActionListener(new ButtonEnterHandler());
        CalculatorGui.window.add(this.buttonEnter);
        (this.buttonBackSpace = new Button("BackSpace")).setFont(new Font("Arial", 0, 14));
        this.buttonBackSpace.setForeground(Color.red);
        this.buttonBackSpace.setBounds(64, 100, 75, 28);
        this.buttonBackSpace.addActionListener(new ButtonBackSpaceHandler());
        CalculatorGui.window.add(this.buttonBackSpace);
        (this.buttonPoint = new Button(".")).setFont(new Font("Arial", 0, 14));
        this.buttonPoint.setForeground(Color.blue);
        this.buttonPoint.setBounds(144, 265, 35, 28);
        this.buttonPoint.addActionListener(new ButtonPointHandler());
        CalculatorGui.window.add(this.buttonPoint);
        (this.buttonClearAll = new Button("C")).setFont(new Font("Arial", 0, 14));
        this.buttonClearAll.setForeground(Color.red);
        this.buttonClearAll.setBounds(144, 133, 35, 28);
        this.buttonClearAll.addActionListener(new ButtonClearAllHandler());
        CalculatorGui.window.add(this.buttonClearAll);
        (this.buttonClear = new Button("CE")).setFont(new Font("Arial", 0, 14));
        this.buttonClear.setForeground(Color.red);
        this.buttonClear.setBounds(144, 100, 35, 28);
        this.buttonClear.addActionListener(new ButtonClearHandler());
        CalculatorGui.window.add(this.buttonClear);
        (this.buttonPlus = new Button("+")).setBounds(195, 265, 35, 28);
        this.buttonPlus.setFont(new Font("Arial", 0, 14));
        this.buttonPlus.setForeground(Color.blue);
        this.buttonPlus.addActionListener(new ButtonPlusHandler());
        CalculatorGui.window.add(this.buttonPlus);
        (this.buttonMinus = new Button("-")).setBounds(195, 232, 35, 28);
        this.buttonMinus.setFont(new Font("Arial", 0, 14));
        this.buttonMinus.setForeground(Color.blue);
        this.buttonMinus.addActionListener(new ButtonMinusHandler());
        CalculatorGui.window.add(this.buttonMinus);
        (this.buttonMul = new Button("*")).setBounds(195, 199, 35, 28);
        this.buttonMul.setFont(new Font("Arial", 0, 14));
        this.buttonMul.setForeground(Color.blue);
        this.buttonMul.addActionListener(new ButtonMulHandler());
        CalculatorGui.window.add(this.buttonMul);
        (this.buttonDiv = new Button("/")).setBounds(195, 166, 35, 28);
        this.buttonDiv.setFont(new Font("Arial", 0, 14));
        this.buttonDiv.setForeground(Color.blue);
        this.buttonDiv.addActionListener(new ButtonDivHandler());
        CalculatorGui.window.add(this.buttonDiv);
        (this.buttonResultPresenter = new Button("=")).setBounds(235, 265, 35, 28);
        this.buttonResultPresenter.setFont(new Font("Arial", 0, 14));
        this.buttonResultPresenter.setForeground(Color.blue);
        this.buttonResultPresenter.addActionListener(new ButtonResultPresenterHandler());
        CalculatorGui.window.add(this.buttonResultPresenter);
        (CalculatorGui.display = new TextField("0")).setEditable(false);
        CalculatorGui.display.setBounds(13, 55, 257, 30);
        CalculatorGui.window.add(CalculatorGui.display);
        CalculatorGui.window.setSize(283, 297);
        CalculatorGui.window.setLocation(40, 80);
        CalculatorGui.window.show();
        CalculatorGui.window.setResizable(false);
        CalculatorGui.window.addWindowListener(new CloseWindowAndExit());
    }
}