/* Problem - Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) ? true
shareDigit(12, 43) ? false
shareDigit(12, 44) ? false
 */

public class Task6 {
	public static void main(String[] args)
	{
		System.out.println(common(21,11));
	}
	public static boolean common(int a, int b)
	{
		int first_a = a/10;
		int second_a=a%10;
		int first_b=b/10;
		int second_b=b%10;
		if((first_a==first_b)||(first_a==second_b)||(second_a==first_b)||(second_a==second_b))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
