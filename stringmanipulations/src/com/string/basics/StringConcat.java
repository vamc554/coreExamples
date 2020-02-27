package com.string.basics;

public class StringConcat {
	public static void main(String[] args) {
		String s1="hari";
		String s2=s1.concat("krishna");
		System.out.println(s1);
		System.out.println(s2);
		String s3="a";
		s3.concat("b");
		System.out.println(s3);
		String s4=s3.concat("c");
		System.out.println(s3);
		System.out.println(s4);
		String s5=s4.concat("e");
		System.out.println(s5);
		String s6=s5.concat("");
		System.out.println(s6);
		System.out.println(s5.equals(s6));
		
		
	}
	

}
