/**
 * 
 */
package org.niranjan.multithreading.interthreadcommunication;

import java.util.List;

/**
 * @author Niranjan
 *
 */
public class ConsumerThread implements Runnable{
	public final List<Integer> TASK_QUEUE;
	
	public ConsumerThread(List<Integer> taskQueue) {
		this.TASK_QUEUE = taskQueue;
	}

	public void consume() throws InterruptedException{
		//synchronized (TASK_QUEUE) {
			//while(TASK_QUEUE.isEmpty()){
				//System.out.println("Queue is empty ! " + Thread.currentThread().getName() + " is waiting to consume !");
				//TASK_QUEUE.wait();
			//}
			int i = TASK_QUEUE.remove(0);
			System.out.println("Consumed : " + i);
			//TASK_QUEUE.notifyAll();
		//}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}