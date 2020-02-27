package com.string.basics;

public class StringImmutabilityCheck {

	public static void main(String[] args) {
		String s1="test";
		String s2="test";
		String s3=new String("test").intern();
		if(s1==s2)System.out.println("s1==s2");
		if(s1==s3)System.out.println("s1==s3");
		if(s2==s3)System.out.println("s2==s3");

	}

}
