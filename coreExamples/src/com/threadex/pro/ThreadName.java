package com.threadex.pro;

public class ThreadName extends Thread {
	public ThreadName(String name) {
		super(name);
		
	}
	public void run() {
		  System.out.println("run method");
		  System.out.println(getName());
	}
	public static void main(String[] args) {
		Thread th=new ThreadName("vamsi");
		th.start();
		System.out.println("main method");
		
		
	}

}
