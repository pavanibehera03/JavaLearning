/* Problem - You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10.
 *  Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
 */

public class Task4 {
	public static void main(String[] args)
	{
		System.out.println(lottery(17,7,7));
	}
	public static int lottery(int a,int b,int c)
	{
		int ab=a+b;
		int bc=b+c;
		int ca=c+a;
		if(ab==10||bc==10||ca==10)
		{
			return 10;
		}
		else if(ab==(10+bc)||ab==(10+ca))
		{
			return 5;
		}
		else
		{
			return 0;
		}
	}

}
