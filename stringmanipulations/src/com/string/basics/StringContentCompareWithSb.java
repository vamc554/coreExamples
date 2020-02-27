package com.string.basics;

public class StringContentCompareWithSb {
	public static void main(String [] args) {
		String s1="a";
		String s2="a";
		StringBuffer sb1=new StringBuffer("a");
		StringBuffer sb2=new StringBuffer("a");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(sb1));
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		
		
	}

}
