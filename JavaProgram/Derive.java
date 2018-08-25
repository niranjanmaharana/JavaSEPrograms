class Derive extends Base
{
	int speed()
	{
		System.out.println("Derive:speed()");
	}
	public static void main(String[] args) 
	{
		Derive d1=new Derive();
		d1.speed();//Derive
		
		Base b1=new Derive();
		b1.speed();//Derive
		
		Base b2=new Base();
		b2.speed();//Base
	}
}