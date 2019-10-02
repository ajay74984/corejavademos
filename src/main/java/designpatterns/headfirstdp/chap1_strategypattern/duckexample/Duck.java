package designpatterns.headfirstdp.chap1_strategypattern.duckexample;

public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	
	QuackBehaviour quackBehaviour;
	
	public Duck() {
	
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public abstract void display();
}
