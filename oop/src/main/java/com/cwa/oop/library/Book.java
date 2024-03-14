package com.cwa.oop.library;

public class Book extends LibraryItem implements Loanable {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public Book() {}
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + getIsbn());
    }

    @Override
    public void loanItem() {
        System.out.println("The book has been loaned.");
    }

    @Override
    public void returnItem() {
        System.out.println("The book has been returned.");
    }
}
