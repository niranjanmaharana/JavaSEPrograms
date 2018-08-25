class A2 
{
	static int a=10;
	static
	{
		System.out.println("A2:Static block:a::"+a);//10
		System.out.println("A2:Static block:b::"+B2.b);
		System.out.println("A2:Static block:b::"+B2.getB());
	}
}
