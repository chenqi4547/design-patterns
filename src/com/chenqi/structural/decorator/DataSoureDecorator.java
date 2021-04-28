package com.chenqi.structural.decorator;

/**
 * @author chenqi
 */
public class DataSoureDecorator implements DataSource {

    private DataSource wrapper;

    public DataSoureDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeDate(String data) {
        wrapper.writeDate(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
