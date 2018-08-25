package org.niranjan.multithreading.interthreadcommunication;

import java.util.List;

public class ProducerThread implements Runnable{
	public final List<Integer> TASK_QUEUE;
	public final int MAX_CAPACITY;
	
	public ProducerThread(List<Integer> taskQueue, int capacity){
		TASK_QUEUE = taskQueue;
		MAX_CAPACITY = capacity;
	}
	
	public void produce(int count) throws InterruptedException{
		//synchronized (TASK_QUEUE) {
			//while(TASK_QUEUE.size() == MAX_CAPACITY){
				//System.out.println("Queue is full. Size : " + TASK_QUEUE.size() + ". " + Thread.currentThread().getName() + " is waiting to produce !");
				//TASK_QUEUE.wait();
			//}
			Thread.sleep(1000);
			TASK_QUEUE.add(count);
			System.out.println("Produced : " + count);
			//TASK_QUEUE.notifyAll();
		//}
	}
	
	@Override
	public void run() {
		int count = 0;
		while(true){
			try {
				produce(count++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}