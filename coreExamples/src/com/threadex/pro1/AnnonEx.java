package com.threadex.pro1;

public class AnnonEx {
	public static void main(String[] args) {
		Thread th=new Thread() {
			public void run() {
			     System.out.println(Thread.currentThread().getName());	
			}
		};
		th.start();
		System.out.println(Thread.currentThread().getName());
	}

}
