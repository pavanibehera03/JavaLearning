
public class Practice {
	public static void main(String[] args)
	{
		int sample[][]=new int[6][5];
		
		System.out.println(sample[1].length);
		String name="pavani";
		char[] name1=name.toCharArray();
		for(char s : name1)
		{
			System.out.println(s);
		}
		String str1="Hello";
		String str2=str1;
		if(str1==str2)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		String array1[]=new String[10];
		array1[0]="1";
		array1[1]="2";
		array1[2]="3";
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[9]);
	}
	
}
