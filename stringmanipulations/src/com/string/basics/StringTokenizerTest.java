package com.string.basics;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	  
	public static void main(String[] args) {
		String s1="vamsi krishna";
		StringTokenizer st=new StringTokenizer(s1," ",true);
		System.out.println("number of tokens:"+st.countTokens());
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}

}
