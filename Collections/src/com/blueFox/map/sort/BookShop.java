package com.blueFox.map.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptyMapException;

public class BookShop {
    private Map<String, Book> bookShop;

    public BookShop() {
        this.bookShop = new HashMap<>();
    }

    public void addBook(String amazonLink, int bookId, String bookTitle, String bookAuthor, double bookPrice) {
        bookShop.put(amazonLink, new Book(bookId, bookTitle, bookAuthor, bookPrice));
    }

    public void removeBook(String title) throws EmptyMapException, ElementNotFindException {
        if(bookShop.isEmpty()) {
            throw new EmptyMapException("Empty book shop");
        }
        
        List<String> bookToRemoveLink = new ArrayList<>();

        for (Map.Entry<String, Book> entry : bookShop.entrySet()) {
            if(entry.getValue().getBookTitle().equalsIgnoreCase(title)){
                bookToRemoveLink.add(entry.getKey());
            }
        }

        if(bookToRemoveLink.isEmpty()) {
            throw new ElementNotFindException("Not find book");
        }

        for (String key : bookToRemoveLink) {
            bookShop.remove(key);
        }
    }

    public Map<String, Book> getBooksByPrice() throws EmptyMapException {
        if(bookShop.isEmpty()) {
            throw new EmptyMapException("Empty book shop");
        }

        List<Map.Entry<String, Book>> booksToSortByPrice = new ArrayList<>(bookShop.entrySet());

        Collections.sort(booksToSortByPrice, new ComparatorByPrice());

        Map<String, Book> booksSortByPrice = new LinkedHashMap<>();

        for (Map.Entry<String,Book> entry : booksToSortByPrice) {
            booksSortByPrice.put(entry.getKey(), entry.getValue());
        }

        return booksSortByPrice;
    }

    public Map<String, Book> getBooksByAuthor() throws EmptyMapException {
        if(bookShop.isEmpty()) {
            throw new EmptyMapException("Empty book shop");
        }
        List<Map.Entry<String, Book>> booksToSortByAuthor = new ArrayList<>(bookShop.entrySet());
    
        Collections.sort(booksToSortByAuthor, new ComparatorByAuthor());
    
        Map<String, Book> booksSortByAuthor = new LinkedHashMap<>();
    
        for (Map.Entry<String, Book> entry : booksToSortByAuthor) {
            booksSortByAuthor.put(entry.getKey(), entry.getValue());
        }
    
        return booksSortByAuthor;
      }

    public Map<String, Book> getBooksByAuthor(String author) throws EmptyMapException {
        if(bookShop.isEmpty()) {
            throw new EmptyMapException("Empty book shop");
        }

        Map<String, Book> bookByAuthor = new LinkedHashMap<>();

        for (Map.Entry<String, Book> entry : bookShop.entrySet()) {
            Book book = entry.getValue();
            if (book.getBookAuthor().equals(author)) {
                bookByAuthor.put(entry.getKey(), book);
            }
        }
        return bookByAuthor;
  }

    public List<Book> getMostExpensiveBook() throws EmptyMapException {
        if(bookShop.isEmpty()) {
            throw new EmptyMapException("Empty book shop");
        }

        double mostExpensivePrice = Double.MIN_VALUE;
        for (Book book : bookShop.values()) {
            if(book.getBookPrice() >= mostExpensivePrice) {
                mostExpensivePrice = book.getBookPrice(); 
            }
        }

        List<Book> mostExpensiveBooks = new ArrayList<>();
        for (Book book : bookShop.values()) {
            if(book.getBookPrice() == mostExpensivePrice) {
                mostExpensiveBooks.add(book);
            }
        }

        return mostExpensiveBooks;
    }

    public List<Book> getCheaperBook() throws EmptyMapException {
        if(bookShop.isEmpty()) {
            throw new EmptyMapException("Empty book shop");
        }

        double CheaperPrice = Double.MAX_VALUE;
        for (Book book : bookShop.values()) {
            if(book.getBookPrice() <= CheaperPrice) {
                CheaperPrice = book.getBookPrice(); 
            }
        }

        List<Book> CheaperBooks = new ArrayList<>();
        for (Book book : bookShop.values()) {
            if(book.getBookPrice() == CheaperPrice) {
                CheaperBooks.add(book);
            }
        }

        return CheaperBooks;
    }
    
}
