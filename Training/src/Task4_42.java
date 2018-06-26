
public class Task4_42 {
	public static void main(String[] args)
	{
		int[] array1= {1, 2, 3, 8, 9, 3, 2, 1};
		System.out.println(mirror(array1));
	}
	public static int mirror(int a[])
	{
		int counter=0;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			counter=0;
			for(int j=a.length-1;i+counter<a.length&&j>=0;j--)
			{
				if(a[i+counter]==a[j])
				{
					counter++;
				}
				else
				{
					if(counter>0)
				    {
					 max=Math.max(max,counter);
					 counter=0;
				     }
			     }
			}
			max=Math.max(counter,max);
		}
		
		return max;
	}
	
}
