package com.string.basics;

public class SubStringRetrival {

	public static void main(String[] args) {
		String s1="java programing language";
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,15));
		System.out.println(s1.substring(5,6));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.substring(5,24));
		String s2="java programming language";
		System.out.println(s2.substring(5,12));
		
		int start=s2.indexOf("program");
		int end=start+7;
		System.out.println(s2.substring(start,end));
		System.out.println(s2.length());
		System.out.println(s2.substring(25,24));
		System.out.println(s2.substring(25));
	}

}
