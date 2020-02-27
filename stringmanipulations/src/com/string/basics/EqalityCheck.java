package com.string.basics;

public class EqalityCheck {

	public static void main(String[] args) {
		String s1="a";
		String s2="a";
		String s3=new String("a");
		String s4=new String("a");
		StringBuffer sb1=new StringBuffer("a");
		StringBuffer sb2=new StringBuffer("a");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(sb1==sb2);
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(sb1.equals(sb2));
		System.out.println(s1.equals(s3));
		String s5="a";
		String s6="A";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println();
		
		Example2 e1=new Example2(5);
		Example2 e2=new Example2(5);
		Example2 e3=new Example2(6);
		Example2 e4=e3;
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		System.out.println(e3==e4);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));
		
		Sample s=new Sample();
	//System.out.println(e1==s);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(e1.equals(s));
		System.out.println(s.equals(e1));
		System.out.println(s==null);
		System.out.println(s.equals(null));
		System.out.println(s.equals(null));
		System.out.println(e1==null);
		System.out.println(e1.equals(null));
		
		
		
		
		
	}

}
