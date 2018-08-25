class Base3
{
	static void m1()
	{
		System.out.println("Base:m1()");
	}
	void m2()
	{
		System.out.println("Base:m2()");
		m1();
	}
}
