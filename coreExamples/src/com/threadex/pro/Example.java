package com.threadex.pro;

public class Example {
	static {
		System.out.println("hi");
		   Thread th=Thread.currentThread();
		   System.out.println("example class is loaded through the thread11:"+th.getName());
	}
	static void m1() {
	   Thread th=Thread.currentThread();
	   System.out.println("example class m1 is executing in the thread22"+th.getName());
	}

}
