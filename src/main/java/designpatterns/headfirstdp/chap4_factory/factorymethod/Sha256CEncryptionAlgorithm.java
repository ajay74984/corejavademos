package designpatterns.headfirstdp.chap4_factory.factorymethod;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha256CEncryptionAlgorithm implements EncryptionAlgorithm {
	@Override
	public String encrypt(String plainText) {
		return DigestUtils.sha256Hex(plainText);
	}
}
