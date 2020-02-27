package com.threadex.pro;

public class Test {

	public static void main(String[] args) {
		//case:1
		//Thread th1=new Thread();
		//th1.start();
		//case:2
	//	MyThread mt=new MyThread();
	//	mt.start();
		//case:3
	//	MyRunnable mr=new MyRunnable();
		//mr.start();
	////	Thread th2=new Thread(mr);
	//	th2.start();
		//case:4
	//	MyThread mt1=new MyThread();
	//	Thread thh2=new Thread(mt1);
	//	thh2.start();
		//Runnable r=new MyRunnable();
	//	Thread thh=new Thread(r);
		//thh.start();
		
		Runnable mr= new MyRunnable();
		Thread mt=new MyThread(mr);
		mt.start();
		
		
		
		
        
	}

}
