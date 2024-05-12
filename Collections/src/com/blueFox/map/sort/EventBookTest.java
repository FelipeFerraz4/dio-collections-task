package com.blueFox.map.sort;

import java.time.LocalDate;
import java.time.Month;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptyMapException;

public class EventBookTest {
    public static void main(String[] args) {
        try {
            EventBook eventBook = new EventBook();

            eventBook.addBook(LocalDate.of(2024, 4, 12), 1, "July Birthday", "Cake");
            eventBook.addBook(LocalDate.of(2026, Month.APRIL, 12), 1, "Philipe Birthday", "Cake");
            eventBook.addBook(LocalDate.of(2025, 4, 12), 1, "Jonh Birthday", "Cake");

            System.out.println(eventBook.getEvents());
            System.out.println(eventBook.getNearestEvent());

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
