/*
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */
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
