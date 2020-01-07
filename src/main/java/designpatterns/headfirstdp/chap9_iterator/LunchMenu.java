package designpatterns.headfirstdp.chap9_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LunchMenu {
	private Map<String, MenuItem> menuItems;
	
	public LunchMenu() {
		menuItems = new HashMap<>();
		addItem("name3", "desc3"
				, true, 3.0);
		addItem("name4", "desc4"
				, false, 4.0);
		//dinnerMenuIterator = new DinnerMenuIterator(menuItems);
	}
	
	public Map<String, MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator getDinnerMenuIterator() {
		return menuItems.values().iterator();
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
		menuItems.put(menuItem.getName(), menuItem);
		
	}
}
