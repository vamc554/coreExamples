package innerclasses;

public class MethodLocal {
	static int a=10;
	int b=10;
	static void m1(final int c,int d) {
		final int e=10;
		int f=10;
		class B{
			  void m1() {
				  System.out.println(a);
				// System.out.println(b);
				  System.out.println(c);
				  System.out.println(d);
				  System.out.println(e);
				  System.out.println(f);
			  }
		}
		B b=new B();
		b.m1();
	}
		void m2() {
			 class C{
				   void m2() {
					   System.out.println(a);
					   System.out.println(b);
				   }
			 }
			 C c=new C();
			 c.m2();
		}
	

          public static void main(String[] args) {
        	  MethodLocal m=new MethodLocal();
        	  m.m1(30,40);
        	  m.a=222;
        	  m.b=2233;
        	  m.m2();
        	  
          }
}