package designpatterns.headfirstdp.chap1_strategypattern.sorter;

public class BubbleSort implements Sorter {
	
	@Override
	public void sort(int[] nums) {
		System.out.println("I am bubble sort");
	}
}
