package me.upp.daligz.designpatterns.structural.adapter.examples.books;

public class AdapterMagazine implements Book{

    private Magazine book;

    public AdapterMagazine(Magazine book) {
        this.book = book;
    }

    @Override
    public String getTitleAndAuthor(){
        return book.getTitle() + " .by " + book.getAuthor() + " .type " + book.getType();
    }
}
