package designpatterns.headfirstdp.chap9_iterator;

import java.util.Iterator;
import java.util.List;

public class PancakeIterator implements Iterator<MenuItem> {
	
	private List<MenuItem> menuItems;
	
	private int index;
	
	public PancakeIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		return index < menuItems.size() && menuItems.get(index) != null;
	}
	
	
	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems.get(index);
		index++;
		return menuItem;
	}
}
