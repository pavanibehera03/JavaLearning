
/* Problem - The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is  6.
 *  Note: the function Math.abs(num) computes the absolute value of a number.
 */
public class Task2 {
	public static void main(String[] args)
	{
		System.out.println(greatNumber(4,10));
	}
	
	public static boolean greatNumber(int a,int b)
	{
		if(a==6 || b==6 || (a-b)==6 || (b-a)==6 || (a+b)==6)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
