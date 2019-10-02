package designpatterns.headfirstdp.chap1_strategypattern.gamexample;

public class SwordBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("I will be using Sword");
	}
}
