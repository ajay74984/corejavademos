package designpatterns.headfirstdp.chap6_command.remoteapi;

public class StereoOnCommand implements Command {
	
	private Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(10);
	}
	
	@Override
	public void undo() {
		stereo.off();
	}
}
