package com.blueFox.list.search;

import com.blueFox.exception.EmptyListException;

public class BookCatalogTest {
    public static void main(String[] args) {
        try {
            BookCatalog bookCatalog = new BookCatalog();

            // System.out.println(bookCatalog.searchByAuthor("Susan J. Fowler"));
            // System.out.println(bookCatalog.searchByTitle("Código Limpo"));
            // System.out.println(bookCatalog.searchByYearRange(2000, 2030));

            bookCatalog.addBook(1, "Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
            bookCatalog.addBook(2, "Java Guia do Programador", "Peter Jandl Junior", 2021);
            bookCatalog.addBook(3, "Código Limpo", "Robert C. Martin", 2009);
            bookCatalog.addBook(4, "O Codificador Limpo", "Robert C. Martin", 2012);

            System.out.println(bookCatalog.searchByAuthor("Susan J. Fowler"));
            System.out.println(bookCatalog.searchByTitle("Código Limpo"));
            System.out.println(bookCatalog.searchByYearRange(2000, 2030));

        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
