package designpatterns.headfirstdp.chap11_proxy.gumball;

import designpatterns.headfirstdp.chap10_state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
	
	int getCount() throws RemoteException;
	
	String getLocation() throws RemoteException;
	
	State getState() throws RemoteException;
}
