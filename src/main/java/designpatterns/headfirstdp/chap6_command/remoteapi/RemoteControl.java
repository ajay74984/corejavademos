package designpatterns.headfirstdp.chap6_command.remoteapi;

import java.util.Arrays;

public class RemoteControl {
	
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = new NoCommand();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPressed() {
		undoCommand.undo();
	}
	
	@Override
	public String toString() {
		return "RemoteControl{" +
				       "onCommands=" + Arrays.toString(onCommands) +
				       ", offCommands=" + Arrays.toString(offCommands) +
				       '}';
	}
}
