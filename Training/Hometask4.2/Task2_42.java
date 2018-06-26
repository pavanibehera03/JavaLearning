
public class Task2_42 {
	public static void main(String[] args)
	{
		int[] array1= {1,1,1,2,1};
		System.out.println(split(array1));
	}
	public static boolean split(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(sumBeforeIndex(i,a)==sumAfterIndex(i,a))
			{
				return true;
			}
		}
		return false;
	}
	
	public static int sumBeforeIndex(int index,int a[])
	{
		int total_BeforeIndex=0;
		for(int i = 0;i<=index;i++)
		{
			total_BeforeIndex+=a[i];
		}
		return total_BeforeIndex;
	}
	public static int sumAfterIndex(int index,int a[])
	{
		int total_AfterIndex=0;
		for(int i = index+1;i<a.length;i++)
		{
			total_AfterIndex+=a[i];
		}
		return total_AfterIndex;
	}

}
