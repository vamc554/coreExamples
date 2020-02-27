package com.threadex.pro;

public class ThreadToString {

	public static void main(String[] args) {
		  Thread th=new Thread();
		  System.out.println(th);
		  Thread th1=new Thread("child1");
		  System.out.println(th1);
		  Thread th2=Thread.currentThread();
		  System.out.println(th2);
		  th2.setPriority(6);
		  Thread th3=new Thread();
		  System.out.println(th3);

	}

}
