/* Problem: You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
 * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
 */


public class Task1 {
	public static void main(String[] args)
	{
		int speed;
		System.out.println(speedCalculation(65,true));
	}
public static int speedCalculation(int value,boolean birthday)
{
	if(birthday==true)
	{
		value = value-5;
	}
	if(value <=60)
	{
		return 0;
	}
	else if(value > 61 && value <=80)
	{
		return 1;
	}
	else
	{
	 return 2;
	}
}

}
