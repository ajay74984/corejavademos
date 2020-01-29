package multithreading;

class Counter {
	int count;
	
	synchronized void incr() {count++;}
}

class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter(); // instantiate Counter
		// Instantiate a thread t1
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				c.incr();
		});
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				c.incr();
		});
		
		t1.start();
		t2.start();
		
		t2.join();
		t1.join();
		
		System.out.println("Count = " + c.count);
	}
}