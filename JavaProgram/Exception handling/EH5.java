/*
When try block throws some exception then finally block is executed. then only the controls goes out of the calling place.
Remaining statements after the finally block will not be executed.
*/
class EH5 
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
		System.out.println("after t/c/f");//unreachable statement
		//return 20;
	}
}