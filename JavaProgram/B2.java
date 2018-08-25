class B2 extends A2
{
	static int b=20;
	static
	{
		System.out.println("B2:Static block:a::"+a);//10
		System.out.println("B2:Static block:b::"+b);
		System.out.println("B2:Static block:b::"+getB());
	}
	static int getB()
	{
		System.out.println("B2:getB():a::"+a+" and b::"+b);
		return b;
	}
	public static void main(String[] jit)
	{
		System.out.println("B2:main(-):a::"+a+" and b::"+b);
	}
}
