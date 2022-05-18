package me.upp.daligz.designpatterns.structural.adapter.examples.books;

public class AdapterBook implements Book{

    private SimpleBook book;

    public AdapterBook(SimpleBook book) {
        this.book = book;
    }

    @Override
    public String getTitleAndAuthor(){
        return book.getTitle() + " .by " + book.getAuthor();
    }
}
