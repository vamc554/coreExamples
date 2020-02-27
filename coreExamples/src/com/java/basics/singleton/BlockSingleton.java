package com.java.basics.singleton;

public class BlockSingleton {
   public static BlockSingleton instance;
   private BlockSingleton() {
	   
   }
    static{
	   instance=new BlockSingleton();
   }
}
