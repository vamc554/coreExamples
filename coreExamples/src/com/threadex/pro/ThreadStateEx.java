package com.threadex.pro;

public class ThreadStateEx extends Thread{
	 public void run() {
		 System.out.println("run start");
		 System.out.println("from run method run after start call"+this.isAlive());;
		 try {
			 Thread.sleep(1000);
		 }
		 catch(InterruptedException e) {}
		 System.out.println("run end");
	 }

	public static void main(String[] args) throws InterruptedException{
		ThreadStateEx ex=new ThreadStateEx();
		System.out.println("from main method after thread object creation"+ex.isAlive());
		ex.start();
		System.out.println("from main method after start call"+ex.isAlive());
		Thread.sleep(500);
		System.out.println("from main method after sleep"+ex.isAlive());;
		Thread.sleep(6000);
		System.out.println("from main method after run completed"+ex.isAlive());
		
	}

}
