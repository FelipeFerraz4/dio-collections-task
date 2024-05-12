package com.blueFox.map.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;

    public Book(int bookId, String bookTitle, String bookAuthor, double bookPrice) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
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

    public double getBookPrice() {
        return bookPrice;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookPrice="
                + bookPrice + "]";
    }


}

class ComparatorByPrice implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Entry<String, Book> b1, Entry<String, Book> b2) {
        return Double.compare(b1.getValue().getBookPrice(), b2.getValue().getBookPrice());
    }
    
}

class ComparatorByAuthor implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Entry<String, Book> b1, Entry<String, Book> b2) {
        return b1.getValue().getBookAuthor().compareToIgnoreCase(b2.getValue().getBookAuthor());
    }

}