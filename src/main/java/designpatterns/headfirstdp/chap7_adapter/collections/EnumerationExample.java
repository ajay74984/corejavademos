package designpatterns.headfirstdp.chap7_adapter.collections;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class EnumerationExample implements Enumeration<String> {
	/**
	 * Tests if this enumeration contains more elements.
	 *
	 * @return {@code true} if and only if this enumeration object
	 * contains at least one more element to provide;
	 * {@code false} otherwise.
	 */
	@Override
	public boolean hasMoreElements() {
		return false;
	}
	
	/**
	 * Returns the next element of this enumeration if this enumeration
	 * object has at least one more element to provide.
	 *
	 * @return the next element of this enumeration.
	 * @throws NoSuchElementException if no more elements exist.
	 */
	@Override
	public String nextElement() {
		return null;
	}
}
