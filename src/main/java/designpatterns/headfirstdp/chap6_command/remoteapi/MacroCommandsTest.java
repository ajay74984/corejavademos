package designpatterns.headfirstdp.chap6_command.remoteapi;

import java.util.Arrays;
import java.util.List;

public class MacroCommandsTest {
	
	public static void main(String[] args) {
		Command lightOnCommand = new LightOnCommand(new Light());
		Command stereoOnCommand = new StereoOnCommand(new Stereo());
		
		List<Command> commands = Arrays.asList(lightOnCommand, stereoOnCommand);
		
		Command macroCommand = new MacroCommand(commands);
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, macroCommand, new NoCommand());
		
		remoteControl.onButtonWasPressed(0);
		
		remoteControl.undoButtonWasPressed();
	}
}
