package singleton.using.enums;

public class Test extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ", " + Sample.getInstance());
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		Thread thread1 = new Thread(test);
		thread1.start();
		
		Thread thread2 = new Thread(test);
		thread2.start();
	}
}