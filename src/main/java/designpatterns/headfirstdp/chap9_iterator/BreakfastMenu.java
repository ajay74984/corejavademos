package designpatterns.headfirstdp.chap9_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu {
	
	private List<MenuItem> menuItems;
	
	private Iterator pancakeIterator;
	
	public BreakfastMenu() {
		menuItems = new ArrayList<>();
		addItem("name", "desc"
				, true, 1.0);
		addItem("name2", "desc2"
				, false, 2.0);
		//pancakeIterator = new PancakeIterator(menuItems);
	}
	
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator getPancakeIterator() {
		return menuItems.iterator();
	}
	
	private void addItem(
			String name, String description,
			boolean vegeterian, double price) {
		menuItems.add(MenuItem.builder()
				              .name(name)
				              .description(description)
				              .price(price)
				              .vegeterian(vegeterian)
				              .build());
	}
}
