package com.string.basics;

public class IndexOfMethod {

	public static void main(String[] args) {
		 String s1="java programming language";
		 System.out.println(s1.length());
		 System.out.println(s1.indexOf('a'));
		 System.out.println(s1.indexOf(' '));
		 System.out.println(s1.indexOf("la"));
         System.out.println(s1.lastIndexOf('a'));
         System.out.println(s1.lastIndexOf("la"));
         System.out.println(s1.indexOf('a',11));
         System.out.println(s1.indexOf("la",18));
         System.out.println(s1.indexOf('a',-5));
         System.out.println(s1.lastIndexOf('a',-5));
         System.out.println(s1.lastIndexOf('a',-2));
		 String s2="javaVamsi";
		 System.out.println(s2.indexOf("vamsi"));
		 String s3=s2.toLowerCase();
		 System.out.println(s3.indexOf("vamsi"));
		 System.out.println(s2);
		 System.out.println(s3);
		 
	}

}
