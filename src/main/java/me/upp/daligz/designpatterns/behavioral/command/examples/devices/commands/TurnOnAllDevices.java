package me.upp.daligz.designpatterns.behavioral.command.examples.devices.commands;

import me.upp.daligz.designpatterns.behavioral.command.examples.devices.devices.ElectronicDevice;

import java.util.List;

/**
 * Created by luisburgos on 13/08/15.
 */
public class TurnOnAllDevices implements Command {

    List<ElectronicDevice> allDevices;

    public TurnOnAllDevices(List<ElectronicDevice> newDevices) {
        allDevices = newDevices;
    }

    public void execute() {
        for (ElectronicDevice device : allDevices) {
            device.on();
        }
    }

    public void undo() {
        for (ElectronicDevice device : allDevices) {
            device.off();
        }
    }
}