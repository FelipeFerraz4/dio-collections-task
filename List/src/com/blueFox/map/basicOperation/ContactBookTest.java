package com.blueFox.map.basicOperation;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptyMapException;

public class ContactBookTest {
    public static void main(String[] args) {
        try {
            ContactBook contactBook = new ContactBook();

            contactBook.addContact("Carla", 21212121);
            contactBook.addContact("Violeta", 78878787);
            contactBook.addContact("Frida", 988212121);

            System.out.println(contactBook.getContactBook());
            System.out.println(contactBook.searchByName("Violeta"));

            contactBook.removeContact("Frida");

            System.out.println(contactBook.getContactBook());

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
