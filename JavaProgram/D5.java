class A5
{
	void m1()
	{
		System.out.println("A:m1()");
	}
	void m2()
	{
		System.out.println("A:m2()");
		m1();
	}
}

class B5 extends A5
{
	void m1()
	{
		System.out.println("B:m1()");
	}
	void m3()
	{
		System.out.println("B:m3()");
		m1();
		super.m2();
	}
}

class C5 extends B5
{
	void m2()
	{
		System.out.println("C:m2()");
		m3();
	}
}

class D5 extends C5
{
	void m1()
	{
		System.out.println("D:m1()");
	}
	void m2()
	{
		System.out.println("D:m2()");
	}
	void m4()
	{
		System.out.println("D:m4()");
	}
	public static void main(String[] args)
	{
		D5 d=new D5();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}