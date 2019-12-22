package designpatterns.headfirstdp.chap6_command.remoteapi;

public class NoCommand implements Command {
	
	@Override
	public void execute() {
		System.out.println("Do Nothing");
	}
	
	@Override
	public void undo() {
		System.out.println("Do Nothing");
	}
}
