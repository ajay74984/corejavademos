package designpatterns.headfirstdp.chap3_decorator.iodecorator;


import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UppercaseToLowercaseStream extends FilterInputStream {
	public UppercaseToLowercaseStream(InputStream inputStream) {
		super(inputStream);
	}
	
	@Override
	public int read() throws IOException {
		int read = in.read();
		return read == -1 ? read : Character.toLowerCase((char) read);
	}
}
