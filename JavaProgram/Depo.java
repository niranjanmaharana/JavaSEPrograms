class Depo 
{
	public static void main(String[] args) 
	{
		CityBus cb=new CityBus();
		cb.breaks();
		cb.engine();

		OsrtcBus ob=new OsrtcBus();
		ob.breaks();
		ob.engine();
	}
}
