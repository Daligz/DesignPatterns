package me.upp.daligz.designpatterns.behavioral.observer.examples.auction;


import me.upp.daligz.designpatterns.behavioral.observer.pattern.Event;
import me.upp.daligz.designpatterns.behavioral.observer.pattern.Observer;
import me.upp.daligz.designpatterns.behavioral.observer.pattern.Subject;

/**
 * Created by luisburgos on 15/07/15.
 */
public class AuctionTestDriven {

    public static void main(String[] args) {

        Subject theAuctioneer = new Auctioneer();

        Observer bidderOne = new Bidder();
        Observer bidderTwo = new Bidder();
        Observer bidderThree = new Bidder();
        Observer announcer = new Announcer();

        theAuctioneer.attach(0, bidderOne);
        theAuctioneer.attach(0, bidderTwo);
        theAuctioneer.attach(0, bidderThree);

        theAuctioneer.attach(1, bidderThree);

        theAuctioneer.attach(2, announcer);

        Event highBid = new Event(0, "HIGH BID");
        Event lowBid = new Event(1, "LOW BID");
        Event announce = new Event(2, "ANNOUNCER");

        theAuctioneer.notifyObserver(0, highBid);
        theAuctioneer.notifyObserver(1, lowBid);
        theAuctioneer.notifyObserver(2, announce);
    }
}
