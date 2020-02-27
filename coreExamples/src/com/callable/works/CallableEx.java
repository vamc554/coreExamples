package com.callable.works;

import java.util.concurrent.Callable;

public class CallableEx implements Callable<Object> {
	int num;
	CallableEx ex;
	public CallableEx(int num) {
		this.num=num;
	}

	@Override
	public Object call() throws Exception {
	    System.out.println("started by"+Thread.currentThread().getName());
	    int sum=0;
	    for(int i=1;i<=this.num;i++) {
	    	sum=sum+i;
	    }
	    
		return sum;
	}
	

}
