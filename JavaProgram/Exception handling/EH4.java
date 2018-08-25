/*
When finally block contains return statement, then no statements are allowed after finally block.
If so, the compiler throws error:"unreachable statement".
*/
class EH4 
{
	static int x;
	public static void main(String[] args) 
	{
		System.out.println("main() start");
		System.out.println(m1());
		System.out.println("main() end");
	}
	static int m1()
	{
		try
		{
			System.out.println("in try");
			return 10;
		}
		catch (Exception e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finally");
			return 30;
		}
		System.out.println("after t/c/f");//unreachable statement
		return 20;
	}
}
