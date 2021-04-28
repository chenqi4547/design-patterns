package com.chenqi.structural.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author chenqi
 */
public class EncryptionDecorator extends DataSoureDecorator {
    public EncryptionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public void writeDate(String data) {
        String encode = encode(data);
        super.writeDate(encode);
    }

    @Override
    public String readData() {
        String result = super.readData();
        return decode(result);
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
