
public class Task8 {
	public static void main(String[] args)
	{
		System.out.println(removeString("Hi Pavani","the"));
	}
	public static String removeString(String base,String remove)
	{
		String lowerBase=base.toLowerCase();
		String lowerRemove=remove.toLowerCase();
		String result = lowerBase.replace(lowerRemove, "");
		return result;
	}
}
