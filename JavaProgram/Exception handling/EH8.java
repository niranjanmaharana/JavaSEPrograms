/*
When try block raises some exception and finally block also raises some exception then finally block exception
replaces or supresses the exception raised in try block.
*/
class EH8
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
			int a=Integer.parseInt("a");//JDH->NumberFormatException
		}
		catch (Exception e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finally");
			return 30/0;//JDH->ArithmeticException
		}
		//System.out.println("after t/c/f");
		//return 20;
	}
}