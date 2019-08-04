package semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		final Semaphore semaphore = new Semaphore(1, true);
		for( int i=0; i<10; i++ ) {
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					try {
						semaphore.acquire();
					} catch( InterruptedException e ) {
						e.printStackTrace();
					}
					System.err.println("Thread " + Thread.currentThread());
					
					try {
						Thread.sleep((long)(Math.random()*1000));
					} catch ( InterruptedException e ) {
						e.printStackTrace();
					}
					System.out.println("Thread " + Thread.currentThread().getName() + " go off!");
					semaphore.release();
					System.err.println("Thread " + Thread.currentThread().getName() + " went off!");
					System.err.println("Concurrent number : " + (3-semaphore.availablePermits()));
				}
			};
			executorService.execute(runnable);
		}
		executorService.shutdown();
	}
}
