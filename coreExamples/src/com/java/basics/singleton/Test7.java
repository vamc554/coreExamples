package com.java.basics.singleton;

public class Test7 {

	public static void main(String[] args) {
		BillpaughSingleton bs=BillpaughSingleton.getInstance();
		System.out.println(bs.hashCode());

	}

}
