package designpatterns.headfirstdp.chap1_strategypattern.multipleifelse;

public class User {
	private String name;
	private UserOffer userOffer;
	
	
	public User(String name, UserOffer userOffer) {
		this.name = name;
		this.userOffer = userOffer;
	}
	
	public String getOffer() {
		return userOffer.getOffer();
		
		//This code was replaced by strategy pattern
		
	/*	if (this.type.equals("gold")) {
			return "this is the offer for gold";
		}
		if (this.type.equals("goldAndInternaltion")) {
			return "this is the offer for goldAndInternaltion";
		}
		if (this.type.equals("goldAndDataHeavy")) {
			return "this is the offer for goldAndDataHeavy";
		}
		if (this.type.equals("silver")) {
			return "this is the offer for silver";
		}
		return null;*/
	}
}
