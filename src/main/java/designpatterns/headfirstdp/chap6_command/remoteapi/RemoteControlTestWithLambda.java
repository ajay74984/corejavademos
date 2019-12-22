package designpatterns.headfirstdp.chap6_command.remoteapi;

public class RemoteControlTestWithLambda {
	
	public static void main(String[] args) {
		Command lightOnCommand = new LightOnCommand(new Light());
		Command stereoOnCommand = new StereoOnCommand(new Stereo());
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(1, lightOnCommand, new NoCommand()); //This could be simplified if we had only single method in
		//command interface with lambda expression as : (1, Light::on, Light::off) -> There would have been no need to create
		//command classes and reduce the burden
		remoteControl.setCommand(2, stereoOnCommand, new NoCommand());
		remoteControl.onButtonWasPressed(1);
		//remoteControl.onButtonWasPressed(2);
		
		remoteControl.undoButtonWasPressed();
	}
}
