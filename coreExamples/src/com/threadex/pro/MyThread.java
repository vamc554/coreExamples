package com.threadex.pro;

public class MyThread extends Thread {
    MyThread(){
        super();
    }
    MyThread(Runnable target){
    	super(target);
    }
    public void run() {
    	System.out.println("from MyThread run()....");
    }
}
