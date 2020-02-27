package com.threadex.pro;

public class Deamon extends Thread{

	public static void main(String[] args) {
		Thread th=new Deamon();
		th.setDaemon(true);
		th.start();
		
		
	}

}
