
public class Task3_42 {
	public static void main(String[] args)
	{
		int[] array1= {1, 1, 1, 1, 1};
		System.out.println(clumps(array1));
	}
	public static int clumps(int a[])
	{
		int count=0;
		boolean flag=false;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1]&&flag==false)
			{
				flag=true;
				count++;
			}
			else if(a[i]!=a[i+1])
			{
				flag=false;
			}
		}
		return count;
	}
}
