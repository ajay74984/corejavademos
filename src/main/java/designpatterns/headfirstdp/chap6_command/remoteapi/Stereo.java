package designpatterns.headfirstdp.chap6_command.remoteapi;

public class Stereo {
	
	private int volume;
	
	public void on() {
		System.out.println("Stereo is On");
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Volume is set ");
	}
	
	public void setCD() {
		System.out.println("Stereo is set to run with CD");
	}
}
