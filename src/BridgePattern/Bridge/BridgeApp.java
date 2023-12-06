package BridgePattern.Bridge;

import Adapter.AdapterPattern.AdapterPatternApp;
import BridgePattern.Devices.Device;
import BridgePattern.Devices.Radio;
import BridgePattern.Devices.TV;
import BridgePattern.Remotes.AdvancedRemote;
import BridgePattern.Remotes.BasicRemote;

public class BridgeApp {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.volumeDown();
        basicRemote.volumeDown();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.volumeUp();
        advancedRemote.channelUp();
        advancedRemote.mute();
        device.printStatus();
    }
}
