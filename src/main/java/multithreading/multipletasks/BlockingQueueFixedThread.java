package multithreading.multipletasks;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class BlockingQueueFixedThread {
	
	private final BlockingQueue<Runnable> blockingQueue;
	private final XThread[] threads;
	private final Object[] threadDataArray;
	private boolean isContinuePool = true;
	private AtomicLong runningCount = new AtomicLong();
	
	public BlockingQueueFixedThread(int numThreads, BlockingQueue<Runnable> blockingQueue) {
		this(numThreads, blockingQueue, null);
	}
	
	private BlockingQueueFixedThread(int numThreads, BlockingQueue<Runnable> blockingQueue, Object[] threadData) {
		this.blockingQueue = blockingQueue;
		threadDataArray = threadData;
		threads = new XThread[numThreads];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new XThread(i);
		}
		for (XThread marThread : threads) {
			marThread.start();
		}
	}
	
	public void submitOrBlock(Runnable runnable) throws InterruptedException {
		runningCount.incrementAndGet();
		while (isContinuePool)
			if (blockingQueue.offer(runnable, 10, TimeUnit.MILLISECONDS)) break;
	}
	
	public void awaitQueueEmpty() throws Exception {
		while (isContinuePool) {
			if (runningCount.get() == 0) {
				return;
			} else {
				synchronized (this) {
					this.wait(100);
				}
			}
		}
		return;
	}
	
	public void awaitTermination() throws Exception {
		if (!isContinuePool) return;
		//If mbContinuePool still true, then we must wait until all thread are done working
		boolean bDoJoin = isContinuePool == true;
		while (isContinuePool) {
			if (runningCount.get() == 0) {
				break;
			} else {
				synchronized (this) {
					this.wait(100);
				}
			}
		}
		isContinuePool = false;
		for (XThread thread : threads) {
			thread.stopWorking();
		}
		for (XThread thread : threads) {
			if (bDoJoin)
				thread.join();
		}
	}
	
	public void forceTermination() {
		isContinuePool = false;
		for (XThread thread : threads) {
			thread.stopWorking();
		}
	}
	
	class XThread extends Thread {
		volatile boolean isContinue = true;
		final int threadIndex;
		
		XThread(int index) {
			threadIndex = index;
		}
		
		void stopWorking() {
			isContinue = false;
		}
		
		public void run() {
			while (isContinue) {
				Runnable localRunnable = null;
				try {
					localRunnable = blockingQueue.poll(1000, TimeUnit.MILLISECONDS);
					if (localRunnable != null) {
						if (threadDataArray != null) {
							((RunnableWithThreadData) localRunnable).run(threadDataArray[threadIndex]);
						} else {
							localRunnable.run();
						}
					}
				} catch (InterruptedException oIE) {
					isContinue = false;
				}
				if (localRunnable != null)
					runningCount.decrementAndGet();
			}
		}
		
	}
}
