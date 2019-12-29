package designpatterns.headfirstdp.chap7_adapter.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class EnumerationIteratorAdapter implements Iterator<String> {
	
	private Enumeration<String> enumeration;
	
	public EnumerationIteratorAdapter(Enumeration<String> enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
	
	
	@Override
	public String next() {
		return enumeration.nextElement();
	}
	
	
	@Override
	public void remove() {
	
	}
	
	@Override
	public void forEachRemaining(Consumer<? super String> action) {
		enumeration.asIterator();
	}
}
