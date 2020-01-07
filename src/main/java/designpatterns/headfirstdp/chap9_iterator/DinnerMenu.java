package designpatterns.headfirstdp.chap9_iterator;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Iterator;

public class DinnerMenu {
	
	private MenuItem[] menuItems;
	
	private Iterator dinnerMenuIterator;
	
	private static final int count = 6;
	
	public DinnerMenu() {
		menuItems = new MenuItem[count];
		addItem("name3", "desc3"
				, true, 3.0);
		addItem("name4", "desc4"
				, false, 4.0);
		//dinnerMenuIterator = new DinnerMenuIterator(menuItems);
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public Iterator getDinnerMenuIterator() {
		return Arrays.asList(menuItems).iterator();
	}
	
	private void addItem(
			String name, String description,
			boolean vegeterian, double price) {
		MenuItem menuItem = MenuItem.builder()
				                    .name(name)
				                    .description(description)
				                    .price(price)
				                    .vegeterian(vegeterian)
				                    .build();
		ArrayUtils.add(menuItems, menuItem);
		
	}
}
