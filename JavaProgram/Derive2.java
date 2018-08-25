class Derive2 extends Base2
{
	public void speed()
	{
		System.out.println("Derive:speed()");
	}
	public static void main(String[] args) 
	{
		Derive2 d1=new Derive2();
		d1.speed();//Derive
		
		Base2 b1=new Derive2();
		b1.speed();//Derive
		
		Base2 b2=new Base2();
		b2.speed();//Base
	}
}