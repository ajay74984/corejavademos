package designpatterns.headfirstdp.chap4_factory.factorymethod;

public class Sha512Encryptor extends Encryptor {
	
	@Override
	public EncryptionAlgorithm getEncryptionAlgorithm() {
		return new Sha512EncryptionAlgorithm();
	}
}
