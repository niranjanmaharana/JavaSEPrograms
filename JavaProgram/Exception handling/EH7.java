/*
When try block returns a value and also finally block returns a value the finally,
then the finally block returned value replace the try block returned value.
*/
/*
When try block raises some exception and finally block also raises some exception then finally block exception
replaces or supresses the exception raised in try block.
*/
class EH7 
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
			return 10;//JDH->10
		}
		catch (Exception e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finally");
			return 30;//JDH->30
		}
		//System.out.println("after t/c/f");
		//return 20;
	}
}