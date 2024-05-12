package com.blueFox.map.basicOperation;

import java.util.HashMap;
import java.util.Map;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptyMapException;

public class ContactBook {
    private Map<String, Integer> contactBook;

    public ContactBook() {
        this.contactBook = new HashMap<>();
    }

    public void addContact(String name, Integer number) {
        contactBook.put(name, number);
    }

    public void removeContact(String name) throws EmptyMapException {
        if (contactBook.isEmpty()) {
            throw new EmptyMapException("Empty contact book");
        }
        contactBook.remove(name);
    }

    public Map<String, Integer> getContactBook() throws EmptyMapException {
        if (contactBook.isEmpty()) {
            throw new EmptyMapException("Empty contact book");
        }
        return contactBook;
    }

    public Integer searchByName(String name) throws EmptyMapException, ElementNotFindException {
        if (contactBook.isEmpty()) {
            throw new EmptyMapException("Empty contact book");
        }
        
        Integer numberByName = null;
        numberByName = contactBook.get(name);

        if (numberByName == null) {
            throw new ElementNotFindException("Contact not find");
        }

        return numberByName;
    }
}
