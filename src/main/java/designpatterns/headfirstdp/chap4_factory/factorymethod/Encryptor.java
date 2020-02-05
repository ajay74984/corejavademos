package designpatterns.headfirstdp.chap4_factory.factorymethod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Encryptor {
	
	public void writeToDisk(String plainText, String fileName) {
		EncryptionAlgorithm algorithm = getEncryptionAlgorithm();
		String encrypt = algorithm.encrypt(plainText);
		File file;
		try (FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName))) {
			fileOutputStream.write(encrypt.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public abstract EncryptionAlgorithm getEncryptionAlgorithm();
}
