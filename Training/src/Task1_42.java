
public class Task1_42 {
	public static void main(String[] args)
	{
		int[] array1= {1,3,2,4,6,7,1,2,1,1,3,1};
		System.out.println(span(array1));
	}
	public static int span(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[0]||a[i]==a[a.length-1])
			{
				count++;
			}
		}
		return count;
	}

}
