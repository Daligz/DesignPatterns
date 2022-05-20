package me.upp.daligz.designpatterns.creational.prototype.examples.animals;

/**
 * Created by luisburgos on 23/07/15.
 */
public class Turtle implements Animal {
    @Override
    public Animal clone() {
        Turtle turtleClone = null;

        try {
            turtleClone = (Turtle) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return turtleClone;
    }

    public String toString(){
        return "This is a Turtle";
    }
}
