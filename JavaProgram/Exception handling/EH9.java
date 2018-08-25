/*
When try block raises some exception and we want normal termination
(i.e. the statements in main method should also be executed normally),
then supress the exception in finally block by just returning some value to the calling place.
*/
class EH9
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
			return 30;//JDH->30
		}
		//System.out.println("after t/c/f");
		//return 20;
	}
}