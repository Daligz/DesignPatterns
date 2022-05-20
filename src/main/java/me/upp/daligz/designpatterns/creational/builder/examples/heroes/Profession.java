package me.upp.daligz.designpatterns.creational.builder.examples.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public enum Profession {

    WARRIOR, THIEF, MAGE, PRIEST, WIZZARD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }


}
