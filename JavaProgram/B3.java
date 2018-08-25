class B3 extends A3
{
	int y=20;
	{
		System.out.println("B3:NSB:y::"+y);
	}
	B3()
	{
		System.out.println("B3:Constructor:x::"+x+" and y::"+y);
		y=6;
	}
	public static void main(String[] jit)
	{
		B3 obj=new B3();
		System.out.println("B3:main(-):x::"+obj.x+" and y::"+obj.y);
	}
}