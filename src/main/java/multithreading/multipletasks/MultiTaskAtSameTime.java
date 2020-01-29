package multithreading.multipletasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultiTaskAtSameTime {
	
	static int miMaxThreads = 4;
	static BlockingQueue<Runnable> moBTQBlockingQ = null;
	static BlockingQueueFixedThread moBTQ = null;
	
	public static void main(String[] args) throws Exception {
		
		moBTQBlockingQ = new ArrayBlockingQueue<>(miMaxThreads * 3);
		moBTQ = new BlockingQueueFixedThread(miMaxThreads, moBTQBlockingQ);
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future<?>> futures = new ArrayList<>();
		
		String[] hostList = {"http://crunchify.com", "http://yahoo.com", "http://www.ebay.com", "http://google.com",
				"http://www.example.co", "https://paypal.com", "http://bing.com/", "http://techcrunch.com/", "http://mashable.com/",
				"http://thenextweb.com/", "http://wordpress.com/", "http://wordpress.org/", "http://example.com/", "http://sjsu.edu/",
				"http://ebay.co.uk/", "http://google123.co.uk/", "http://wikipedia.org/", "http://en.wikipedia.org"};
		//CountDownLatch latch = new CountDownLatch(hostList.length);
		/*ExecutorService executor = new ThreadPoolExecutor(10, 10,
				0, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<>(5));*/ //this fails because we can not unblock the queue, no timeout options
		
		
		try {
			for (String url : hostList) {
				//Runnable worker = new CustomRunnable(url, latch);
				Runnable worker = new CustomRunnable(url);
				moBTQ.submitOrBlock(worker);
				//executor.submit(worker);
				//List<Future<>> -> executor.involeAll(callables) also returns a list of futures with isDone true
				//This also does not gaurantee that state is cancelled or completed.
				/*Future<?> submit = executor.submit(worker);
				futures.add(submit);*/
				//new Thread(worker).start();
			}
			//latch.await();
		} catch (Exception e) {
			System.out.println("I am an error");
		}
		/*
		boolean allDone = true;
		for (Future<?> future : futures) {
			allDone &= future.isDone(); // check if future is done //this actually checks if state is not new
			//so this is not a full proof solution.
		}
		
		
		if (allDone) {
			System.out.println("All Done");
		}*/ finally {
			moBTQ.awaitQueueEmpty();
			System.out.println("All Process Completed....");
			System.out.println("Parent Thread Resuming work....");
		}
		
	}
}
