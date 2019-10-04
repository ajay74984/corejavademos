package designpatterns.headfirstdp.chap3_decorator.iodecorator;

import java.io.*;

public class UppercaseToLowerCaseTester {
	
	public static void main(String[] args) {
		try {
			InputStream inputStream = new FileInputStream(new File("test.txt"));
			InputStream bufferedStream = new BufferedInputStream(inputStream);
			InputStream uppercaseToLowercaseStreams = new UppercaseToLowercaseStream(bufferedStream);
			int c;
			while ((c = uppercaseToLowercaseStreams.read()) >= 0) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
