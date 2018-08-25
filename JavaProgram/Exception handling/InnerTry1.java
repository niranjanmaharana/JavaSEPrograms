class InnerTry1 
{
	public static void main(String[] args) 
	{
		System.out.println("1");
		try
		{
			System.out.println("2");
			System.out.println("3");
			try
			{
				System.out.println("4");
				System.out.println("5");
			}
			catch (Exception e)
			{
				System.out.println("6");
				System.out.println("7");
			}
			finally
			{
				System.out.println("8");
				System.out.println("9");
			}
		}
		catch (Exception e)
		{
			System.out.println("10");
			System.out.println("11");
		}
		finally
		{
			System.out.println("12");
			System.out.println("13");
		}
		System.out.println("14");
	}
}
