package com.callable.works;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableEx [] ex= { new CallableEx(10),
				            new CallableEx(20),
				            new CallableEx(30),
				            new CallableEx(40)};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(CallableEx ca:ex) {
			Future<Object> f=service.submit(ca);
			System.out.println(f.get());
			
		}
		service.shutdown();
		
		} 
		
	}


