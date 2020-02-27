package com.java.basics.singleton;

public class Test5 {

	public static void main(String[] args) {
		EagerSingleton es1=EagerSingleton.getInstance();
		System.out.println(es1.hashCode());
		
	}

}
