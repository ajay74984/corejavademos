package effectivejavademos.trywithresourceitem9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TryWithResouceTest {
	
	public static void main(String[] args) throws IOException {
		//firstLineOfFile("test.txt");
		firstLineOfFiles("test.txt");
	}
	
	/*
	This case illustrate that if there are chances of exception at try and finally block,
	first exception thrown is suppressed and only 2nd exception is shown. In this example null pointer due
	to finally block. I have put catch block just to show exception was also thrown in try block but
	never printed.
	 */
	static void firstLineOfFile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			br = null; //trying to simulate a case where underlying file system is down
			br.readLine();
		} catch (Exception e) {
			System.out.println("Hello Exception");
		} finally {
			br.close();
		}
	}
	
	/*
	In this example first exception is never suppressed due to try with resource, br.close is causing an exception of stream closed.
	If there was an exception after br.readline(), that would have been suppressed to show br.close() exception.
	Suppressed exceptions can be accessed via getSuppressed method in throwables.
	 */
	// try-with-resources - the the best way to close resources!
	static void firstLineOfFiles(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader(path))) {
			br.close();
			br.readLine();
		} catch (Exception e) {
			System.out.println(Arrays.toString(e.getSuppressed()));
		}
	}
	
	
}
