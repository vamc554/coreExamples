package com.synchronization.examples;

public class Add {
   static 	int x,y;

	 static synchronized void  add(int x, int y) {
	   Add.x=x;
	   Add.y=y;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int res = Add.x + Add.y;
		System.out.println("in " + Thread.currentThread().getName() + "result:" + res);
	}

}
