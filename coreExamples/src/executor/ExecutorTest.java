package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {
		ExecutorEx [] ex= { new ExecutorEx("vamsi"),
				          new ExecutorEx("radha"),
				          new ExecutorEx("devika"),
				          new ExecutorEx("dhruv"),
				          new ExecutorEx("damodar"),
				          new ExecutorEx("gowri")};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(ExecutorEx ec:ex) {
			service.submit(ec);
		}
		service.shutdown();
		
				          
		}

	}


