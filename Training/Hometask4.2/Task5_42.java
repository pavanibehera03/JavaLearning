/*
 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */
public class Task5_42 {
	public static void main(String[] args)
	{
		int[] array1= {1, 2, 4, 6, 1};
		int[] array2= {2,6};
		System.out.println(linear(array1,array2));
	}
	public static boolean linear(int outer[],int inner[])
	{
		int counter=0;
		int j=0;
		for(int i=0;i<outer.length;i++)
		{
			if(outer[i]==inner[j])
			{
				counter++;
				j++;
			}
			else if(outer[i]>inner[j])
			{
				return false;
			}
		
		if(counter==inner.length)
		{
			return true;
		}
		}	
     return false;
	}

}
