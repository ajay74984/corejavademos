package designpatterns.headfirstdp.chap2_observer.messaging;

public class Observer1 implements Observer {
	
	@Override
	public void update(Message message) {
		System.out.println("Subscriber 1 :" + message.getMesage());
	}
}
