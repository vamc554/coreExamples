package com.synchronization.examples;

public class Thread1 extends Thread{
	
	public void run() {
		Add.add(50, 60);
	}

}
