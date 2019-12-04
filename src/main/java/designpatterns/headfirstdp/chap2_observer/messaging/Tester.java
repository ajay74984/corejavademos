package designpatterns.headfirstdp.chap2_observer.messaging;

public class Tester {
	
	public static void main(String[] args) {
		Observer one = new Observer1();
		Observer two = new Observer2();
		Observer three = new Observer3();
		
		
		Subject pulisher = new MessageApp();
		
		pulisher.attachObserver(one);
		pulisher.attachObserver(two);
		pulisher.attachObserver(three);
		
		pulisher.notifyy(new Message("I am a message"));
		
		pulisher.deAttach(three);
		
		pulisher.notifyy(new Message("I am a message"));
	}
}
