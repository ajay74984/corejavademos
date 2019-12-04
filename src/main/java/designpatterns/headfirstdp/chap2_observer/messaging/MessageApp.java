package designpatterns.headfirstdp.chap2_observer.messaging;

import java.util.ArrayList;
import java.util.List;

public class MessageApp implements Subject {
	
	List<Observer> observerList;
	
	public MessageApp() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void attachObserver(Observer observer) {
		observerList.add(observer);
	}
	
	@Override
	public void deAttach(Observer observer) {
		observerList.removeIf(obs -> obs.equals(observer));
	}
	
	@Override
	public void notifyy(Message message) {
		observerList.forEach(observer -> observer.update(message));
	}
}
