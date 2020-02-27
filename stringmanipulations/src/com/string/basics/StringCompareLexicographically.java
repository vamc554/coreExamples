package com.string.basics;

public class StringCompareLexicographically {

	public static void main(String[] args) {
		     String s1="a";
		     String s2="a";
		     String s3="abc";
		     String s4="aBc";
		     String s5=new String("abc");
		     System.out.println(s1.compareTo(s2));
		     System.out.println(s3.compareTo(s4));
		     System.out.println(s3.compareTo(s5));
		     String s6=new String("ayg");
		     System.out.println(s3.compareTo(s6));
		     System.out.println(s3.compareToIgnoreCase(s4));

	}

}
