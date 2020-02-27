package com.vamsi.ex;

public class Test1 {
		public static void main(String[] args)throws InterruptedException{
			System.out.println("main start");
			MyThread mt=new MyThread();
			mt.interrupt();
			
		}

	}

