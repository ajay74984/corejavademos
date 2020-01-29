package multithreading.multipletasks;

public abstract class RunnableWithThreadData implements Runnable {
	public void run() {
		throw new RuntimeException("Not implemented function. Should use 'void run(Object oThreadData)'");
	}
	
	abstract void run(Object threadData);
}