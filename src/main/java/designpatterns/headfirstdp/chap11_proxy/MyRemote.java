package designpatterns.headfirstdp.chap11_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
	
	public String sayHello() throws RemoteException;
}
