package com.chenqi.structural.decorator;

/**
 * @author chenqi
 */
public interface DataSource {
    void writeDate(String data);

    String readData();
}
