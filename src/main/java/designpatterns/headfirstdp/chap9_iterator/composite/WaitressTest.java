package designpatterns.headfirstdp.chap9_iterator.composite;


public class WaitressTest {
	
	public static void main(String[] args) {
		
		
		MenuComponent allMenu = new Menu("All Menu", "All Items and Menus");
		
		MenuComponent pancakeMenu = new Menu("Breakfast Menu", "Items related to bfst");
		
		MenuComponent idili = new MenuItem("Idili", "South indian", true, 10);
		MenuComponent omlete = new MenuItem("omelete", "North indian", false, 20);
		MenuComponent chai = new MenuItem("chai", "North indian", true, 10);
		
		pancakeMenu.add(idili);
		MenuComponent dinnerMenu = new Menu("Dinner Menu", "Items related to Dinner");
		dinnerMenu.add(omlete);
		MenuComponent cafeMenu = new Menu("Cafe Menu", "Items related to cafe");
		cafeMenu.add(chai);
		
		allMenu.add(pancakeMenu);
		allMenu.add(dinnerMenu);
		allMenu.add(cafeMenu);
		Waitress waiteress = new Waitress(allMenu);
		
		waiteress.print();
	}
}
