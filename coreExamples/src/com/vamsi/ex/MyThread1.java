package com.vamsi.ex;

	public class MyThread1 extends Thread{
		public void run() {
			System.out.println("run start");
			try {
				System.out.println("before pause-1");
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				System.out.println("e raised");
			}
			try {
				System.out.println("before pause-2");
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				System.out.println("e raised");
			}
			System.out.println("after pause 2");
			System.out.println("run end");
		}

	}

