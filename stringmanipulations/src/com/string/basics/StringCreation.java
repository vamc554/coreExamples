package com.string.basics;

public class StringCreation {

	public static void main(String[] args) {
		String s1=new String();
		System.out.println(s1);  //Empty string wil be printed
		String  s2="abc";
		String s3=new String(s2);
		String s4=new String("bbc");
		String s5=s4;
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println("s5:"+s5);
		System.out.println(s2==s3);
		System.out.println(s4==s5);
		StringBuffer sb=new StringBuffer("vamsi");
		String s6=new String(sb);
		System.out.println(sb);
		System.out.println(s6);
	//	System.out.println(s6==sb);  //incomparable types
		StringBuilder sb1=new StringBuilder("vamc");
		String s7=new String(sb1);
		System.out.println(sb1);
		System.out.println(s7);
		//System.out.println(s7==sb1);//incomparable types
		char[] ch= { 'a','b','c','d','e','f'};
		String s8=new String(ch);
	    System.out.println(ch);
	    System.out.println(s8);
	    String s9=new String(ch,2,3);
	    System.out.println(s9);
	    byte[] b= {97,98,99};
	    String s10=new String(b);
	    System.out.println(b);
	    System.out.println(s10);
	    String s11=new String(b,2,1);
	    System.out.println(s11);
	    String s12=new String(ch,0,2);
	    System.out.println(s12);
	    System.out.println(s12.length());
	  //  String s13=new String(null);
	    String s13=null;
	    System.out.println("s13..."+s13);
	  //  System.out.println(s13.length());
	 //   String s14=new String(s13);// null pointer exception
	  //  String s15=new String((String)null);
	    String s15=null;
	    System.out.println("s15 chars:"+s15);
	    //System.out.println(s15.length());
	    String s16=new String("null");
	    System.out.println("s16 chars"+s16);
	    System.out.println(s16.length());
	    String s22="";
	    System.out.println(s22);
	    System.out.println(s22.length());
	    String s23=new String();
	    String s24=new String("");

	}

}
