package org.niranjan.multithreading.interthreadcommunication;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static final List<Integer> TASK_QUEUE = new ArrayList<>();
	public static final int MAX_CAPACITY = 5;
	
	public static void main(String[] args) {
		Thread producerThread = new Thread(new ProducerThread(TASK_QUEUE, MAX_CAPACITY), "Producer");
		Thread consumerThread = new Thread(new ConsumerThread(TASK_QUEUE), "Consumer");
		
		producerThread.start();
		consumerThread.start();
	}
}