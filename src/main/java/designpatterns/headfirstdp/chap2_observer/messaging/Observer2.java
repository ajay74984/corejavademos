package designpatterns.headfirstdp.chap2_observer.messaging;

public class Observer2 implements Observer {
	
	@Override
	public void update(Message message) {
		System.out.println("Subscriber 2 :" + message.getMesage());
	}
}
