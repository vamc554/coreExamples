package innerclasses;

 class Aa {
	int x=1;
	void m1() {
		 final int x=2;
		 class Bb{
			   int x=3;
			   void m2() {
				     System.out.println(x);
				     int x=4;
				     System.out.println(x);
				     System.out.println(this.x);
				     System.out.println(Bb.this.x);
				     System.out.println(Aa.this.x);
			   }   
		 }
		 Bb b=new  Bb();
		 b.m2();
		 System.out.println(x);
		 System.out.println(b.x);
		 System.out.println(this.x);
		 
	}
	public static void main(String[] args) {
		Aa a=new Aa();
		a.m1();
	}

}
