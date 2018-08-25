/*
In a non void method the last statement should be the return statement.
If in try block return statement is placed then also at the last statement return should be placed.
Else the compiler throws error: 
missing return statement
*/
class EH2 
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
		System.out.println("after t/c/f");//missing return statement
	}
}
