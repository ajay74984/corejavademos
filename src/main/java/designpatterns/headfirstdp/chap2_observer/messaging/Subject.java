package designpatterns.headfirstdp.chap2_observer.messaging;

public interface Subject {
	
	void attachObserver(Observer observer);
	
	void deAttach(Observer observer);
	
	void notifyy(Message message);
}
