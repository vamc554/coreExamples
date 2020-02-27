package com.threadex.pro1;

public class SyncEx extends Thread{
	int i;
	public SyncEx(int i) {
		this.i=i;
		
	}
	public void run() {
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello Thread "+i+"....."+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		SyncEx t=new SyncEx(4);
		t.start();
		SyncEx t1=new SyncEx(7);
		t1.start();
		
		
	}

}
