package com.cwa.oop.library;

public class Main {

    public static void main(String[] args) {
        Book myBook = new Book("Armand");
        //myBook.setAuthor();
        myBook.setTitle("Programming");
        myBook.setIsbn("GT65FD");
        myBook.displayInfo();


        Ebook myEbook = new Ebook("Jules", "Stats");
        myEbook.setTitle("Economics");
        myEbook.setIsbn("76HFGK");
        myEbook.displayInfo();
    }

}
