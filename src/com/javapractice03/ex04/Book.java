package com.javapractice03.ex04;

public class Book {
    // Property
    private String bookName;
    private String author;

    // Constructor
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    // Setter
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Method
    public void showBookInfo() {
        System.out.printf("%s,%s\n", this.bookName, this.author);
    }

    public Book copyBook() {
        return new Book(this.bookName, this.author);
    }
}
