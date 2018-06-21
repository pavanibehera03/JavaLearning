
public class Task10 {
	public static void main(String[] args)
	{
		System.out.println(sum("5 19"));
	}
	public static int sum(String str)
	{
		char[] chars= str.toCharArray();
		int sum=0;
		String temp="";
		int length=chars.length;
		for (int i = 0; i < length; i++) {
			if(Character.isDigit(chars[i]))
			{
				if (i < length-1 && Character.isDigit(chars[i+1])) {
                temp=temp+chars[i];
 			}
				else
				{
					temp=temp+chars[i];
					sum=sum+Integer.parseInt(temp);
					temp="";
				}
		}
	}
return sum;
	}
}
