
public class Task3 {
	public static void main(String[] args)
	{
		System.out.println(party(5,6));
	}
	public static int party(int tea,int candy)
	{
		if(tea<5 || candy<5)
		{
			return 0;
		}
		else if(tea>=(2*candy)||candy>=(2*tea))
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
}
