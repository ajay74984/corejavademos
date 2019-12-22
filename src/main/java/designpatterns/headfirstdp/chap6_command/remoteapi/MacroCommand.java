package designpatterns.headfirstdp.chap6_command.remoteapi;

import java.util.List;

/*
This class is a list of commands to execute when single button is pressed.
 */
public class MacroCommand implements Command {
	
	private List<Command> commands;
	
	public MacroCommand(List<Command> commands) {
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		commands.forEach(Command::execute);
	}
	
	@Override
	public void undo() {
		commands.forEach(Command::undo);
	}
}
