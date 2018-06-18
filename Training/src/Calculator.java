
public class Calculator {
	public static void main(String[] args)
	{	
		float value1 = Integer.parseInt(args[0]);
		float value2 = Integer.parseInt(args[1]);
		switch(args[2])
		{
		case "+" : System.out.println(value1+value2);break;
		case "-" : System.out.println(value1- value2);break;
		case "*" : System.out.println(value1*value2);break;
		case "/" : System.out.println(value1/value2);break;
		case "%" : System.out.println((value1/value2)*100);break;
		case "rem" : System.out.println(value1%value2);break;
		case "default" :System.out.println("Operator not found!");break;
		}
	}

}
