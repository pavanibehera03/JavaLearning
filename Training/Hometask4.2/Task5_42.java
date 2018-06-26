
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
