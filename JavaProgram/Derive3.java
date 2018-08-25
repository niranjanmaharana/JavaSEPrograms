class Derive3 extends Base3
{
	static void m1()
	{
		System.out.println("Derive:m1()");
	}
	public static void main(String[] args)
	{
		Derive3 d1=new Derive3();
		d1.m1();//derive
		d1.m2();//base

		Base3 b1=new Derive3();
		b1.m1();//derive(since overriden method) based on obj type
		b1.m2();//base(since not present)
	}
}
