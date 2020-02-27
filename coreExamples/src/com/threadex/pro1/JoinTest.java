package com.threadex.pro1;


public class JoinTest extends Thread {
	public  static InheritableThreadLocal<Object> ts=new InheritableThreadLocal<>();
 	
	public void run() {
		System.out.println("enteresd to run method");
		Object j=Thread.currentThread().getName();
	//	System.out.println(j);
	//	System.out.println(ts.get());
		Thread s=  (Thread)ts.get();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
			System.out.println("join called");
		try {
			s.join();
			for(int i=1;i<=5;i++) {
				System.out.println("join  run call");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("after join");
		
	}
    public static void main(String[] args) {
    	System.out.println("Entered to main");
    	Object tt=Thread.currentThread();
    	ts.set(tt);
    //	System.out.println(ts.get());
    	Thread th=new JoinTest();
    	th.start();
    	for(int i=1;i<=5;i++) {
    		System.out.println("hello");
    	}
    	try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("exit main");
    }
}