package designpatterns.headfirstdp.chap2_observer.messaging;

public final class Message {
	
	private final String mesage;
	
	public Message(String mesage) {
		this.mesage = mesage;
	}
	
	public String getMesage() {
		return mesage;
	}
}
