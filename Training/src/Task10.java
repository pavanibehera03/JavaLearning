/* Problem -Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") ? 123
sumNumbers("aa11b33") ? 44
sumNumbers("7 11") ? 18
 */

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
