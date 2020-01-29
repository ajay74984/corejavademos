package designpatterns.headfirstdp.chap11_proxy.gumball;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineDrive {
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		Naming.rebind("gummachine", new GumballMachine());
	}
}
