package com.chenqi.structural.bridge;

/**
 * @author chenqi
 */
public class Client {
    public static void main(String[] args) {
        Television television = new Television();
        BasicRemote tvRemote = new BasicRemote(television);
        tvRemote.power();
        tvRemote.channelUp();
        television.printStatus();

        AdvancedRemote advancedRemote = new AdvancedRemote(television);
        advancedRemote.mute();
        television.printStatus();

        Radio radio = new Radio();
        BasicRemote radioRemote = new BasicRemote(radio);
        radioRemote.power();
        radioRemote.channelDown();
        radioRemote.volumeUp();
        radio.printStatus();

        advancedRemote = new AdvancedRemote(radio);
        advancedRemote.mute();
        radio.printStatus();
    }
}
