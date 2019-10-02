package designpatterns.headfirstdp.chap1_strategypattern.gamexample;

public class GameTester {
	
	public static void main(String[] args) {
		Character king = new King();
		king.setWeaponBehavior(new SwordBehavior());
		king.fight();
	}
}
