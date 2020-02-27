package innerclasses;

public class MethodLoClass {
	Object m1() {
		class B{
			void m3() {
				  System.out.println("hello method local");
			  }
		}
		B b=new B();
		return b;
	}
	public static void main(String[] args) {
		System.out.println("Main");
		MethodLoClass m=new MethodLoClass();
		Object obj=m.m1();
		System.out.println("after m1");
		System.out.println(obj.getClass().getName());
		
	}

}
