/*We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
*/

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