class InnerTry4
{
	public static void main(String[] args) 
	{
		System.out.println("1");
		try
		{
			System.out.println("2");
			try
			{
				System.out.println("3");
				int a=Integer.parseInt("A");//NFE
			}
			catch (ArithmeticException e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println("5");
			}
			System.out.println("6");
		}
		catch (Exception e)
		{
			System.out.println("7");
		}
		finally
		{
			System.out.println("8");
		}
		System.out.println("9");
	}
}

/*OUTPUT*/
/*
1
2
3 NFE
5
7
8
9


*/