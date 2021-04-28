package com.chenqi.structural.decorator;

import java.io.*;

/**
 * @author chenqi
 */
public class FileDataSource implements DataSource {

    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeDate(String data) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        File file = new File(fileName);
        char[] buffer = new char[(int) file.length()];
        try (FileReader fileReader = new FileReader(fileName)) {
            fileReader.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new String(buffer);
    }
}
