package singleton.using.enums;

public class Sample {
	private static final Sample SAMPLE = new Sample();
	public static int x = 0;
	
	private Sample(){
		
	}
	
	public static Sample getInstance(){
		try {
			if(x%2 == 0)
				Thread.sleep(5000);
			else
				Thread.sleep(2000);
			x++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return SAMPLE;
	}
}