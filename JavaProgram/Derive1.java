class Derive1 extends Base1
{
	static void speed()
	{
		System.out.println("Derive:speed()");
	}
	public static void main(String[] args) 
	{
		Derive1 d1=new Derive1();
		d1.speed();//Derive
		
		Base1 b1=new Derive1();
		b1.speed();//Derive
		
		Base1 b2=new Base1();
		b2.speed();//Base
	}
}