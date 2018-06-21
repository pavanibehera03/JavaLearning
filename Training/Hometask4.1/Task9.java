
public class Task9 {
	public static void main(String[] args)
	{
		System.out.println(block("abbcddeee"));
	}
	public static int block(String str)
	{
		int count=0;
		int totalCount=0;
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			if(i<length-1 && str.charAt(i)==str.charAt(i+1))
				totalCount++;
			else
				totalCount=1;
			if(totalCount>count)
				count=totalCount;
		}
		return count;
	}

}
