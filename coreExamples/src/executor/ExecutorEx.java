package executor;
public class ExecutorEx implements Runnable{
	String name;
	ExecutorEx(String name){
		this.name=name;
		
	}
	public void run() {
		System.out.println(name+"...job started by Thread:..."+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
	}

}
