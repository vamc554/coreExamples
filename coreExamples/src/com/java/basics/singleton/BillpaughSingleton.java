package com.java.basics.singleton;

public class BillpaughSingleton {
	private BillpaughSingleton() {
		
	}
private static  class BillpaughSingletonInner{
	private static final BillpaughSingleton bs=new BillpaughSingleton();
}
  public static BillpaughSingleton getInstance() {
	  return BillpaughSingletonInner.bs;
  }
}
