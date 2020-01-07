package designpatterns.headfirstdp.chap9_iterator.composite;

public interface MenuComponent {
	
	default void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	
	default void remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	
	default MenuComponent getChild(int node) {
		throw new UnsupportedOperationException();
	}
	
	default String getName() {
		throw new UnsupportedOperationException();
	}
	
	default String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	default double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	default boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	default void print() {
		throw new UnsupportedOperationException();
	}
	
}
