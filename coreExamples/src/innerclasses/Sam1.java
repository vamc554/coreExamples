package innerclasses;

public class Sam1 {
	 int x=20;
     class B{
    	 int x=50;
    	 void m1() {
    		 System.out.println(x);
    		 System.out.println(this.x);
    		 System.out.println(Sam1.this.x);
    	 }
    	 void m2() {
    		  int x=60;
    		  System.out.println(x);
    		  System.out.println(this.x);
    		  System.out.println(Sam1.this.x);
    	 }
    	 
     }
     void m3() {
    	 System.out.println(x);
         B b=new B();
         System.out.println(b.x);
     }

	public static void main(String[] args) {
		Sam1 a=new Sam1();
		a.m3();
		
		Sam1.B b=new Sam1().new B();
		b.m1();
		b.m2();
	
		

	}

}
