package com.chenqi.structural.bridge;

/**
 * @author chenqi
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("AdvancedRemote: mute");
        device.setVolume(0);
    }
}
