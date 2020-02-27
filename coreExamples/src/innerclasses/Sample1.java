package innerclasses;

public class Sample1 {  
	   static int a=10;
	   int x=20;
	   private int y=30;
	   
	 class B{
		B() {
			 System.out.println(a);
			 System.out.println(x);
			 System.out.println(y);
		 }

	 }
	 public static void main(String[] args) {
		 Sample1 s=new Sample1();
		 Sample1.B a=s.new B();
		 
	 }

}
