package com.chenqi.structural.decorator;

/**
 * @author chenqi
 */
public class Client {
    public static void main(String[] args) {
        String content = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("out/demo.txt");

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);

        encryptionDecorator.writeDate(content);

        System.out.println("encryption data : \n" + fileDataSource.readData());

        System.out.println("decryption data : \n" + encryptionDecorator.readData());
    }
}
