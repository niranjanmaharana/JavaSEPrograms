class InnerTry5
{
	public static void main(String[] args) 
	{
		System.out.println("Inside main()");
		try
		{
			System.out.println("Outer try");
			try
			{
				System.out.println("Inner try");
				int a=Integer.parseInt("A");//NFE
			}
			catch (ArithmeticException e)
			{
				System.out.println("Inner catch");
			}
			finally
			{
				System.out.println("Inner finally");
			}
			System.out.println("After outer t/c/f");
		}
		catch (NullPointerException e)
		{
			System.out.println("Outer catch");
		}
		finally
		{
			System.out.println("Outer finally");
		}
		System.out.println("After outer t/c/f");
	}
}
/*OUTPUT*/

/*
Inside main()
Outer try
Inner try
Inner finally
Outer finally
NFE
*/