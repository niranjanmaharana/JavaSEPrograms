/*
When there is no return statement at the last line after the finally block of the called method,
then it becomes mandatory to have a return statement in finally block and there  should  not  be
any statement after finally block in the called method.
*/
class EH6 
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
		//System.out.println("after t/c/f");
		//return 20;
	}
}