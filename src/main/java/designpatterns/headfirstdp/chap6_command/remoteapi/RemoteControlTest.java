package designpatterns.headfirstdp.chap6_command.remoteapi;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		Command lightOnCommand = new LightOnCommand(new Light());
		Command stereoOnCommand = new StereoOnCommand(new Stereo());
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(1, lightOnCommand, new NoCommand());
		remoteControl.setCommand(2, stereoOnCommand, new NoCommand());
		remoteControl.onButtonWasPressed(1);
		//remoteControl.onButtonWasPressed(2);
		
		remoteControl.undoButtonWasPressed();
	}
}
