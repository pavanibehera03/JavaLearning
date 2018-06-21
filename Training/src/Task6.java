
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
