package com.string.basics;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String s1="Hari Nit";
		System.out.println(s1);
		String[] sa1=s1.split(" ");
		System.out.println(sa1[0]+"..."+sa1[1]);
		System.out.println(Arrays.toString(sa1));
		String[] sa2=s1.split("a");
		System.out.println(sa2.length);
		System.out.println(Arrays.toString(sa2));
		s1="abc bbc cbc";
		String[] sb3=s1.split("c");
		System.out.println(sb3.length);
		System.out.println(Arrays.toString(sb3));
		  String str = "geekss@fors@geekss"; 
	        String[] arrOfStr = str.split("s"); 
	  
	        for (String a : arrOfStr) 
	            System.out.println(a); 
		
		
		

	}

}
