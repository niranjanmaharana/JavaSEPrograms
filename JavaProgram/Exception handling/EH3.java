/*
Here no error is there since the last statement also contains return statement.
But the JVM will return 10 from the try block since the last statement after finally block will not be executed.
*/
class EH3 
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
		}
		System.out.println("after t/c/f");
		return 20;
	}
}
