package designpatterns.headfirstdp.chap9_iterator;

import java.util.Iterator;

public class Waiteress {
	
	private DinnerMenu dinnerMenu;
	private BreakfastMenu breakfastMenu;
	Iterator dinnerMenuIterator;
	Iterator pancakeIterator;
	
	public Waiteress() {
		this.dinnerMenu = new DinnerMenu();
		this.breakfastMenu = new BreakfastMenu();
		dinnerMenuIterator = dinnerMenu.getDinnerMenuIterator();
		pancakeIterator = breakfastMenu.getPancakeIterator();
	}
	
	void printMenu() {
		if (dinnerMenuIterator.hasNext()) {
			System.out.println("It has come here");
			System.out.println(dinnerMenuIterator.next());
		}
	}
}
