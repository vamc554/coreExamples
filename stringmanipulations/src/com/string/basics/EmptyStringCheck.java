package com.string.basics;

import java.util.Scanner;

public class EmptyStringCheck {

	public static void main(String[] args) {
		String s1="";
		String s2=" ";
		String s3="a";
		String s4=new String();
		String s5=new String("");
		String s6=new String("  ");
		String s7=new String("a");
		System.out.println("is s1 is empty::"+s1.isEmpty());
		System.out.println("is s2 is empty::"+s2.isEmpty());
		System.out.println("is s3 is empty::"+s3.isEmpty());
		System.out.println("is s4 is empty::"+s4.isEmpty());
		System.out.println("is s5 is empty::"+s5.isEmpty());
		System.out.println("is s6 is empty::"+s6.isEmpty());
		System.out.println("is s7 is empty::"+s7.isEmpty());
		String s8=null;
	//	System.out.println("is s8 is empty::"+s8.isEmpty());
		String s9;
		//System.out.println("is s9 is empty::"+s9.isEmpty());
		Scanner scn=new Scanner(System.in);
		System.out.print("\nEnter String1:");
		System.out.print(scn.nextLine().isEmpty());
		System.out.print("\nEnterString2:");
		System.out.print(scn.nextLine().isEmpty());
		System.out.print("\nEnter string3");
		System.out.print(scn.nextLine().isEmpty());
	}

}
