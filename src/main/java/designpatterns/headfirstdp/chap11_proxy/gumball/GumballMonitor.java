package designpatterns.headfirstdp.chap11_proxy.gumball;

import java.rmi.RemoteException;

public class GumballMonitor {
	
	GumballMachineRemote remote;
	
	public GumballMonitor(GumballMachineRemote remote) {
		this.remote = remote;
	}
	
	public void report() {
		try {
			System.out.println("Count : " + remote.getCount());
			System.out.println("Location : " + remote.getLocation());
			System.out.println("State : " + remote.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
