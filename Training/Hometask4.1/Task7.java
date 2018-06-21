
public class Task7 {
	public static void main(String[] args)
	{
		System.out.println(sumLimit(26,12));
	}
public static int sumLimit(int a,int b)
{
	int result = a+b;
	int length = String.valueOf(result).length();
	if(length>String.valueOf(a).length())
	{
		return a;
	}
	else
	{
		return result;
	}
}
}
