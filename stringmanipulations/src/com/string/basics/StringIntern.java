package com.string.basics;

public class StringIntern {

	public static void main(String[] args) {
		String s1="Hari ";
		String s2=s1.intern();
		System.out.println(s1==s2);//true
		String s3=new String("NIT");
		String s4=s3.intern();
		String s5="NIT";
		System.out.println(s3==s4);//false
		System.out.println(s3==s5);//false
		System.out.println(s4==s5);//true
		String s6=s1.trim();
		String s7=s6.intern();
		System.out.println(s6==s7);//true
		String s8="HariNIT";
		String s9=s6.concat(s5).intern();
		String s10=s9.intern();
		System.out.println(s8==s10);//true
		System.out.println(s8==s9);
		
		

	}

}
