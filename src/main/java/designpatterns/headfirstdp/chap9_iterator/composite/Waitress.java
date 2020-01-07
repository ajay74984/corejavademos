package designpatterns.headfirstdp.chap9_iterator.composite;

public class Waitress {
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void print() {
		allMenus.print();
	}
}
