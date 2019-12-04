package designpatterns.headfirstdp.chap2_observer.messaging;

public class Observer3 implements Observer {
	
	@Override
	public void update(Message message) {
		System.out.println("Subscriber 3:" + message.getMesage());
	}
}
