package com.blueFox.set.search;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptySetException;

public class ContactBookTest {
    public static void main(String[] args) {
        try {
            ContactBook contactBook = new ContactBook();

            contactBook.addContact(1, "Fatima", "12132332");
            contactBook.addContact(2, "Fabiana", "21132332");
            contactBook.addContact(3, "Estela", "12232332");

            contactBook.updateContactNumber("Fatima", "89898989");

            System.out.println(contactBook.getContacts());
            System.out.println(contactBook.searchByName("Fa"));

        } catch (EmptySetException e) {
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
