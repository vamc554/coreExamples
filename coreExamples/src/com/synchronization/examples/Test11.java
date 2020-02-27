package com.synchronization.examples;

public class Test11 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//System.out.print(Thread.currentThread().getThreadGroup().list());

		
	}

}
