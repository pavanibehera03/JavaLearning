
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
