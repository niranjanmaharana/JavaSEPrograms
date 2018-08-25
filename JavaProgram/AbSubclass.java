class AbSubclass extends AbstractTest 
{
	public void sample()
	{
		System.out.println("sample(-)");
	}
	public static void main(String[] args) 
	{
		AbSubclass obj=new AbSubclass();
		obj.sample();
		System.out.println("Hello World!");
	}
}
