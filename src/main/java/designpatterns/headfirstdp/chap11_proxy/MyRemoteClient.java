package designpatterns.headfirstdp.chap11_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
	
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	private void go() {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi");
			service.sayHello();
		} catch (RemoteException | MalformedURLException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
