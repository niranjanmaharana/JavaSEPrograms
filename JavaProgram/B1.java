class B1 extends A1
{
	static int b=m2();
	static int m2()
	{
		System.out.println("B1:m2():a::"+a+" and b::"+b);
		return 20;
	}
	static
	{
		System.out.println("B1:Static block:a::"+a+" and b::"+b);
	}
	public static void main(String[] jit)
	{
		System.out.println("B1:main(-)");
		System.out.println("B1:main-:a::"+a+" and b::"+b);
	}
}
