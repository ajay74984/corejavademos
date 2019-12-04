package designpatterns.headfirstdp.chap1_strategypattern.sorter;

public class Worker {
	
	private Sorter sorter;
	
	public Worker(Sorter sorter) {
		this.sorter = sorter;
	}
	
	public void sortElements(int[] nums) {
		sorter.sort(nums);
	}
}
