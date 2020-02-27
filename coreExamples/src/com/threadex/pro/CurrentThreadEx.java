package com.threadex.pro;

public class CurrentThreadEx {
	  static {
		  System.out.println("in static block");
		  Thread th=Thread.currentThread();
		  System.out.println("static block executing in"+th.getName());
	  }

	public static void main(String[] args) {
		System.out.println("main method");
		Thread th=Thread.currentThread();
		System.out.println("original priority of main thread");
		System.out.println(th.getPriority()+"   "+th.getName());
		System.out.println("after changing");
		th.setName("vamsi");
		th.setPriority(6);
		System.out.println(th.getPriority()+"  "+th.getName());
		
	}

}
