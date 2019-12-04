package designpatterns.headfirstdp.chap1_strategypattern.multipleifelse;

public class UserTest {
	
	public static void main(String[] args) {
		User user = new User("Ajay", new GoldOffer());
		System.out.println(user.getOffer());
	}
}
