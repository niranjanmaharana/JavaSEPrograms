package singleton.using.enums;

public enum Example {
	INSTANCE;
	private int value;
	
	private Example() {
		this.value = 0;
	}
	
	public int getValue(){
		return this.value;
	}
}