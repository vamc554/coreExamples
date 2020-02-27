package com.java.basics.singleton;

public class Test3 {

	public void run() {
		System.out.println("run");
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode()+"run");
		
	}
	

	public static void main(String[] args) {
		test1 t=new test1();
		Thread t1=new Thread(t);
		t1.start();
		System.out.println("before main");
		Singleton s2=Singleton.getInstance();
		System.out.println(s2.hashCode()+"main");
		
	}

}
