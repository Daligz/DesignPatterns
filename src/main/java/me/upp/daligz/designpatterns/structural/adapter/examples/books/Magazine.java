package me.upp.daligz.designpatterns.structural.adapter.examples.books;

public class Magazine {

    private String title;
    private String author;
    private String type;

    public Magazine(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }
}
