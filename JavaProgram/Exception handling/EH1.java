class EH1 
{
	static int x;
	public static void main(String[] args) 
	{
		System.out.println("main() start");
		try
		{
			System.out.println("in try");
			x=Integer.parseInt("a");
		}
		catch(NullPointerException e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finally");
		}
		System.out.println("after t/c/f");
	}
}
