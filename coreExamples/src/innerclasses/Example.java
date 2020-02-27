package innerclasses;

public class Example {
	int x=10;
	static class A{
		  static void m1() {
			//  A a=new A();
			 // System.out.println(a.x);
			  Example e=new Example();
			  System.out.println(e.x);
		  }
		  
	}

}
