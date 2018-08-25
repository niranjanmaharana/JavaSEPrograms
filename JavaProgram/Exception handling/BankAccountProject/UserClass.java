class UserClass
{
	public static void main(String[] args)throws MyException
	{
		try
		{
			throw new MyException("Some Exception Message");
		}
		catch (MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
