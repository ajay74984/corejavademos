package designpatterns.headfirstdp.chap11_proxy.gumball;

import designpatterns.headfirstdp.chap10_state.State;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
	
	protected GumballMachine() throws RemoteException {
	}
	
	@Override
	public int getCount() throws RemoteException {
		return 10;
	}
	
	@Override
	public String getLocation() throws RemoteException {
		return "Dunnmy";
	}
	
	@Override
	public State getState() throws RemoteException {
		return null;
	}
}
