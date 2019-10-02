package designpatterns.headfirstdp.chap1_strategypattern.gamexample;

public abstract class Character {
	
	private WeaponBehavior weaponBehavior;
	
	public void fight() {
		weaponBehavior.useWeapon();
	}
	
	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
}
