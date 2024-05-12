package com.blueFox.map.sort;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptyMapException;

public class BookShopTest {
    public static void main(String[] args) {
        try {
            BookShop bookShop = new BookShop();

            bookShop.addBook("https://amzn.to/3EclT8Z", 1, "1984", "George Orwell", 50d);
            bookShop.addBook("https://amzn.to/47Umiun", 2, "A Revolução dos Bichos", "George Orwell", 7.05d);
            bookShop.addBook("https://amzn.to/3L1FFI6", 3,  "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
            bookShop.addBook("https://amzn.to/3OYb9jk", 4,  "Malorie", "Josh Malerman", 5d);
            bookShop.addBook("https://amzn.to/45HQE1L", 5, "E Não Sobrou Nenhum", "Agatha Christie", 50d);
            bookShop.addBook("https://amzn.to/45u86q4", 6, "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

            System.out.println(bookShop.getBooksByAuthor("Agatha Christie"));
            System.out.println(bookShop.getBooksByAuthor());
            System.out.println(bookShop.getBooksByPrice());
            System.out.println(bookShop.getCheaperBook());
            System.out.println(bookShop.getMostExpensiveBook());

            bookShop.removeBook("Caixa de Pássaros - Bird Box: Não Abra os Olhos");

            System.out.println(bookShop.getBooksByPrice());

        } catch (EmptyMapException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ElementNotFindException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
