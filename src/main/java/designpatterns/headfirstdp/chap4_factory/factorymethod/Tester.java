package designpatterns.headfirstdp.chap4_factory.factorymethod;

public class Tester {
	
	public static void main(String[] args) {
		Encryptor encryptor = new Sha256Encryptor();
		encryptor.writeToDisk("I am a text", "newFile.txt");
	}
}
