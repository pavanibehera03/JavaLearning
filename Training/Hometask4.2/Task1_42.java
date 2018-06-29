/*Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
*/
public class Task1_42 {
	public static void main(String[] args)
	{
		int[] array1= {1,3,2,4,6,7,1,2,1,1,3,1};
		System.out.println(span(array1));
	}
	public static int span(int a[])
	{
		int count=0;
		int span=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					count=(j-i)+1;
				}
				if(span<count)
				{
					span=count;
				}
			}
		}
		return span;
	}
}