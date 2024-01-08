import java.util.Scanner;

//Η κλάση Rpn ορατή απο όλους
public class RpnCalculator
{
	
//Χρήσιμες μεταβλητές με την λέξη static ωστε να μπορούμε να εχουμε πρόσβαση σε αυτές χωρίς να δημηουργήσουμε καινούριο στιγμιότυπο
	static final int NUMBER=1;
	static String expression;
	static Scanner sc;
	static String input;
	static int inputType;
	static int [] stack;
	static int sp;
	
	public static void main(String[] args) {
	
		System.out.println("Revese Polish Notation Calculator");
	//ορίζουμε το stack
		stack = new int[20];
	//δείκτης sp του πόσο γεμάτη είναι η στίβα
		sp = 0;
	//η getExpression θα διαβάζει το input του χρήστη
		expression = getExpression();
		System.out.println(expression);
		sc = new Scanner(expression);
		sc.useDelimiter(" ");
		while (sc.hasNext())
		{
			//ψάχνουμε να δούμε με τι operand εχουμε να κάνουμε και μετά θα του προσδώσουμε μια λειτουργικότητα
			inputType = getOp();
			switch(inputType)
			{
			//αν το input είναι αριθμός τον σπρώχνουμε πάντα στην στοίβα
			case NUMBER: push(Integer.parseInt(input)); break;
			case '+': add(); break;
			case '-': sub(); break;
			case '*': mul(); break;
			case '/': div(); break;
			case '=': displayresult(); break;
			}
			
		}
	}
	//Stack management commands
	
	//ορίζουμε το pop ως αφαίρεση ενώς αντικειμένου απο την stack --
	private static int pop()
	{
		return stack[--sp];
	}
	
	//Αντίστοιχα για το push
	private static void push(int integer)
	{
		stack[sp] = integer;
		sp++;
	}
	
	
	static int getOp()
	{
		input = sc.next();
		if(Character.isDigit(input.charAt(0)))
		{
			return NUMBER;
		}
		else
		{
			return input.charAt(0);
		}
	}
	
	static String getExpression()
	{
		sc = new Scanner(System.in);
		System.out.print("Expression to evaluate: ");
		expression = sc.nextLine();
		sc.close();
		return expression;
	}
	
	//το πρώτο αντικείμενο στην στίβα είναι το αποτέλεσμα των πραξεων αρα το εκτυπώνουμε
	private static void displayresult()
	{
		System.out.println("result=" + pop());
	}
	
	//βγάζω τους δύο τελευταίους αριθμούς τους παω στην cpu τους προσθέτω και το αποτέλεσμα το ξαναβάζω μέσα
	private static void add()
	{
		push(pop()+pop());
	}
	
	//βγάζω τους δύο τελευταίους αριθμούς τους παω στην cpu τους αφαιρώ και το αποτέλεσμα το ξαναβάζω μέσα
	private static void sub()
	{
		push(pop()-pop());
	}
	//ομοίως
	private static void mul()
	{
		push(pop()*pop());
	}
	//you get the point
	private static void div()
	{
		push(pop()/pop());
	}
}