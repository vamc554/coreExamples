package innerclasses;

public class Example1 {
	 static class A{
		 private int y=20;
		 static void m1() {
			 System.out.println("inner class static method");
		 }
		 void m2() {
			 System.out.println("inner clas snon static method");
			 
		 }
		 
	 }
     public static void main(String[] args) {
    	 A.m1();
    	// A.m2();
    	 A a=new A();
    	 a.m1();
    	 a.m2();
    	 System.out.println(a.y);
    	 
     }
}
