package designpatterns.headfirstdp.chap11_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	
	public MyRemoteImpl() throws RemoteException {
	}
	
	@Override
	public String sayHello() throws RemoteException {
		return null;
	}
	
	public static void main(String[] args) {
		try {
			MyRemote remote = new MyRemoteImpl();
			Naming.rebind("helloService", remote);
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
