package me.upp.daligz.designpatterns.behavioral.observer.examples.auction;

import me.upp.daligz.designpatterns.behavioral.observer.pattern.Event;
import me.upp.daligz.designpatterns.behavioral.observer.pattern.Observer;

/**
 * Created by luisburgos on 15/07/15.
 */
public class Announcer implements Observer {

    private static int ID = 0;

    @Override
    public void update(Event event) {
        System.out.println(
                "ID: " + (++ID) +
                        ", Updating event type: " +  event.getType() +
                        ", Event description: " + event.getDescription());
    }
}
