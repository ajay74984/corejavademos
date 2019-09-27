package effectivejavademos.singelton;

public enum SingletonEnum {
	INSTANCE;
	
	public void doSomething() {
		System.out.println("Do Something");
	}
}