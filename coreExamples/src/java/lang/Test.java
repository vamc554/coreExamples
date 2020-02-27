package java.lang;

public class Test {
	public static void main(String[] args)throws InterruptedException{
		System.out.println("main start");
		MyThread mt=new MyThread();
		mt.interrupt();
		
	}

}
