class A1 
{
	static int a=m1();
	static int m1()
	{
		System.out.println("A1:m1()-a::"+a);
		return 10;
	}
	static
	{
		System.out.println("A1:Static block:a::"+a);
	}
	public static void main(String[] jit)
	{
		System.out.println("A1:main(-)");
	}
}
