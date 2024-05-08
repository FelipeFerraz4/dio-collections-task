package com.blueFox.list.search;

import java.util.ArrayList;
import java.util.List;

import com.blueFox.list.exception.EmptyListException;

public class BookCatalog {
    private List<Book> bookCatalog;

    public BookCatalog() {
        this.bookCatalog = new ArrayList<>();
    }

    public void addBook(int bookId, String bookTitle, String bookAuthor, int bookYearOfPublication){
        bookCatalog.add(new Book(bookId, bookTitle, bookAuthor, bookYearOfPublication));
    }

    public List<Book> searchByAuthor(String bookAuthor) throws EmptyListException {
        List<Book> bookByAuthor = new ArrayList<>();
        if(!bookCatalog.isEmpty()){
            for (Book book : bookCatalog) {
                if(book.getBookAuthor().equalsIgnoreCase(bookAuthor)){
                    bookByAuthor.add(book);
                }
            }
            return bookByAuthor;
        } else {
            throw new EmptyListException("Empty book catalog");
        }
    }

    public List<Book> searchByYearRange(int startYear, int endYear) throws EmptyListException {
        List<Book> bookByYearRange = new ArrayList<>();
        if(!bookCatalog.isEmpty()){
            for (Book book : bookCatalog) {
                if(startYear <= book.getBookYearOfPublication() && book.getBookYearOfPublication() <= endYear){
                    bookByYearRange.add(book);
                }
            }
            return bookByYearRange;
        } else {
            throw new EmptyListException("Empty book catalog");
        }
    }

    public List<Book> searchByTitle(String title) throws EmptyListException {
        List<Book> bookByTitle = new ArrayList<>();
        if(!bookCatalog.isEmpty()){
            for (Book book : bookCatalog) {
                if(book.getBookTitle().equalsIgnoreCase(title)){
                    bookByTitle.add(book);
                }
            }
            return bookByTitle;
        } else {
            throw new EmptyListException("Empty book catalog");
        }
    }
}
