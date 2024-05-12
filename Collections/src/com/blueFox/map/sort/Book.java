package com.blueFox.map.sort;

public class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private int bookYearOfPublication;

    public Book(int bookId, String bookTitle, String bookAuthor, int bookYearOfPublication) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYearOfPublication = bookYearOfPublication;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookYearOfPublication() {
        return bookYearOfPublication;
    }

    @Override
    public String toString() {
        return "[bookId: " + bookId + ", bookTitle: " + bookTitle + ", bookAuthor: " + bookAuthor
                + ", bookYearOfPublication: " + bookYearOfPublication + "]";
    }
}
