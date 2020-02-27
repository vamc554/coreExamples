package innerclasses;
interface v{
	  public void m3();
}

public class Examplee{
	v m1() {
		 class Ex1 implements v{
			 public void m3() {
				 System.out.println("m3 method");
				 
			 }
		 }
		    Ex1 e = new Ex1();
			m2(e);
			return e;
		 }
	void m2(v e) {
		e.m3();
	}
	}



