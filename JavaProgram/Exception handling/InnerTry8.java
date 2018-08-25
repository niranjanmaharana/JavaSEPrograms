class InnerTry8
{
	public static void main(String[] args) 
	{
		System.out.println("Inside main()");
		System.out.println(m1());
		System.out.println("Outside main()");
	}
	public static int m1()
	{
		try
		{
			System.out.println("Outer try");
			try
			{
				System.out.println("Inner try");
				int a=Integer.parseInt("A");//JDH->NFE
			}
			catch (ArithmeticException e)
			{
				System.out.println("Inner catch");
			}
			finally
			{
				System.out.println("Inner finally");
			}
			System.out.println("After inner t/c/f");
			return 10;
		}
		catch (NullPointerException e)
		{
			System.out.println("Outer catch");
		}
		finally
		{
			System.out.println("Outer finally");
			return 30;//JDH->30
		}
		//System.out.println("After outer t/c/f");
		//return 20;
	}
}
/*OUTPUT*/
/*
Inside main()
Outer try
Inner try
Inner finally
Outer finally
30
*/