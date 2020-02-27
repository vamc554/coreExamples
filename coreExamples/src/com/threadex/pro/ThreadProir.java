package com.threadex.pro;

public class ThreadProir extends Thread {
	public void run() {
              System.out.println(getName()+ "run executed");		
	}

	public static void main(String[] args) {
		ThreadProir tp=new ThreadProir();
		ThreadProir tp1=new ThreadProir();
		tp.setPriority(7);
		tp1.setPriority(9);
		tp.start();
		tp1.start();
		System.out.println("main executed");
		
		
	}

}
