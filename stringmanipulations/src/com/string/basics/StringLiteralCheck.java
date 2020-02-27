package com.string.basics;

public class StringLiteralCheck {
	public static void main(String[] args) {
		String s1=new String("vamsi");
		String s2=s1.intern();
		String s3="vamsi";
		System.out.println(s2==s3);
		
		System.out.println(s1==s2);
	}

}
