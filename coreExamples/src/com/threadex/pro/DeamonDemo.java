package com.threadex.pro;

public class DeamonDemo implements Runnable{
	Thread th;
	public void run() {
		System.out.println("run()" +th.isDaemon());
		for(int i=1;i<=100;i++) {
			System.out.println("run:"+i);
		}
		
	}

	public DeamonDemo() {
		th=new Thread(this);
		th.setDaemon(true);
		th.start();
	
	}

}
