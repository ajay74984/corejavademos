package multithreading.multipletasks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

public class CustomRunnable implements Runnable {
	
	private final String url;
	
	private CountDownLatch latch;
	
	public CustomRunnable(String url, CountDownLatch latch) {
		this.url = url;
		this.latch = latch;
	}
	
	
	public CustomRunnable(String url) {
		this.url = url;
	}
	
	@Override
	public void run() {
		System.out.println("Current Thread Name : " + Thread.currentThread().getName());
		String result = "";
		int code = 200;
		try {
			URL siteURL = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.connect();
			
			code = connection.getResponseCode();
			if (code == 200) {
				result = "-> Green <-\t" + "Code: " + code;
			} else {
				result = "-> Yellow <-\t" + "Code: " + code;
			}
		} catch (Exception e) {
			result = "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();
			
		}
		System.out.println(url + "\t\tStatus:" + result);
		//latch.countDown();
	}
}

