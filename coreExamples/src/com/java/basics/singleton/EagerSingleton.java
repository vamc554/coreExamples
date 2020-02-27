package com.java.basics.singleton;

public class EagerSingleton{
     private static EagerSingleton es=new EagerSingleton();
     private EagerSingleton() {
    	 
     }
     public static EagerSingleton getInstance() {
    	 return es;
    	 
     }
}
