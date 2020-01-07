package designpatterns.headfirstdp.chap9_iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {
	
	private MenuItem[] menuItems;
	private int position = 0;
	
	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		return position < menuItems.length && menuItems[position] != null;
	}
	
	
	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems[position];
		position++;
		return menuItem;
	}
}
