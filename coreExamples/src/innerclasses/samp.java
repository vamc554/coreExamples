
package innerclasses;

public class samp {
	class D{
		  void m1() {
			  System.out.println("d m1");
		  }
	}
	void m2() {
		   D d=new D();
		   d.m1();
	}
   public static void main(String[] args) {
	   samp s=new samp();
	   s.m2();
	   
	   
   }
}
