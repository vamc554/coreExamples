package com.string.basics;

public class StartWithEndsWith {

	public static void main(String[] args) {
		String  s1="abc bbc cbc";
		System.out.println(s1.startsWith("abc"));
		System.out.println(s1.endsWith("abc"));
		System.out.println(s1.endsWith("cbc"));
	}

}
