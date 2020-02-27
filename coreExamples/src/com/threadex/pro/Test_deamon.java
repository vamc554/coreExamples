package com.threadex.pro;

public class Test_deamon {

	public static void main(String[] args) {
		DeamonDemo d=new DeamonDemo();
		System.out.println("jai hind");
		for(int i=1;i<=5;i++) {
			System.out.println("main"+i);
		}
		System.out.println("bye");
	}

}
