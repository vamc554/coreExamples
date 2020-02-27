package innerclasses;

public class staticInnerEx {
	static int a=10;
	int x=20;
	private  int y=30;
	static class A{
		public static void main(String[] args) {
			System.out.println(a);
			//System.out.println(x);
			//System.out.println(y);
			staticInnerEx e=new staticInnerEx();
			System.out.println(a);
			System.out.println(e.x);
			System.out.println(e.y);
			
			///A c=new A();
			//System.out.println(c.a);
			//System.out.println(c.x);
			
		}
	}
	

}
