package me.upp.daligz.designpatterns.behavioral.command.examples.devices.commands;

import me.upp.daligz.designpatterns.behavioral.command.examples.devices.devices.ElectronicDevice;

/**
 * Created by luisburgos on 13/08/15.
 */
public class VolumeDownTelevision implements Command {

    private ElectronicDevice device;

    public VolumeDownTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumenDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }


}
