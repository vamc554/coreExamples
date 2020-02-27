package com.java.basics.singleton;

public class Test6 {

	public static void main(String[] args) {
		BlockSingleton bs=BlockSingleton.instance;
		System.out.println(bs);
		System.out.println(bs.hashCode());
		
	}

}
