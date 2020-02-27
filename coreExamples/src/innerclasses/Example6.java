package innerclasses;

public class Example6 {
	 static {
		 System.out.println("outer class static block ");
	 }
	 public Example6() {
		System.out.println("outer class constructor");
	}
	 static class A{
		 static {
			 System.out.println("inner class static block");
		 }
		 A(){
			 System.out.println("inner class constructor");
		 }
	
	 static void m1() {
		 System.out.println("inner class Sm");
	 }
	 void m2() {
		 System.out.println("inner class non static method");
	 }
	 public static void main(String[] args) {
		 System.out.println("inner class main");
          Example6.m3();
		 Example6 e6=new Example6();
		 e6.m4();
	 }
}
 static  void m3() {
	 System.out.println("outer class SM");
 }
 void m4() {
	 System.out.println("outer class NSM");
 }
 public static void main(String[] args) {
	 System.out.println("outer claass main");
	 A.m1();
	 A a=new A();
	 a.m2();
	 
 }
	 
	 
 }
