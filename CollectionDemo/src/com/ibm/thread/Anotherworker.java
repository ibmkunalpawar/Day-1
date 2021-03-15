package com.ibm.thread;

public class Anotherworker implements Runnable {
	@Override
	public void run() {
		System.out.println("in another worker thread="+Thread.currentThread());
	}

}
