class Demo 
{
	//static variable of class type
	static Demo obj1;
	//non static variable of class type
	Demo obj2;

	//constructor
	Demo()
	{
		//assign obj reference to static variable
		Demo.obj1=this;
		//assign obj reference to non static variable using static variable
		this.obj2=Demo.obj1;
	}

	//main
	public static void main(String args[])
	{
		//create variable of class type
		Demo obj3;
		//assign object reference to local variable
		obj3=new Demo();
		//access the non static method
		obj3.m1();
	}

	//non-static method
	public void m1()
	{
		System.out.println("First obj:"+Demo.obj1);
		System.out.println("Second obj:"+this.obj2);
	}
}
