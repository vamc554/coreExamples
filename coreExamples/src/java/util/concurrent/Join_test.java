package java.util.concurrent;

public class Join_test extends Thread {
	public void run() {
		System.out.println("enteresd to run method");
		Object j=Thread.currentThread().getClass().getName();
		System.out.println(j);
		
	}
    public static void main(String[] args) {
    	System.out.println("Entered to main");
    	Object s=Thread.currentThread().getClass().getName();
    	System.out.println(s);
    }
}
