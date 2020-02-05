package designpatterns.headfirstdp.chap4_factory.factorymethod;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha512EncryptionAlgorithm implements EncryptionAlgorithm {
	@Override
	public String encrypt(String plainText) {
		return DigestUtils.sha512Hex(plainText);
	}
}
