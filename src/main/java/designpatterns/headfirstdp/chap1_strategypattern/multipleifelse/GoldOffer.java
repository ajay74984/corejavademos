package designpatterns.headfirstdp.chap1_strategypattern.multipleifelse;

public class GoldOffer implements UserOffer {
	
	@Override
	public String getOffer() {
		return "this is the offer for gold";
	}
}
