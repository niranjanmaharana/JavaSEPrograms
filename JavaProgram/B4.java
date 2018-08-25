class B4 extends A4
{
	int x=40;
	public static void main(String[] args) 
	{
		A4 a=new A4();
		B4 b=new B4();
		a=b;//Super class obj can refer to sub class
		System.out.println(a.x);
		System.out.println(b.x);
		//b=a;//incompatible type
		b=(B4)a;
		System.out.println(a.x);
		System.out.println(b.x);	
	}
}
