package com.blueFox.set.search;

import java.util.HashSet;
import java.util.Set;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptySetException;

public class ContactBook {
    private Set<Contact> contactBook;

    public ContactBook() {
        this.contactBook = new HashSet<>();
    }

    public void addContact(int contactId, String contactName, String contactNumber) {
        contactBook.add(new Contact(contactId, contactName, contactNumber));
    }

    public Set<Contact> getContacts() throws EmptySetException {
        if(!contactBook.isEmpty()) {
            return contactBook;
        } else {
            throw new EmptySetException("Empty contact book");
        }
    }

    public Set<Contact> searchByName(String name) throws EmptySetException {
        Set<Contact> contactsByName = new HashSet<>();
        if(!contactBook.isEmpty()) {
            for (Contact contact : contactBook) {
                if(contact.getContactName().startsWith(name)) {
                    contactsByName.add(contact);
                }
            }
            return contactsByName;
        } else {
            throw new EmptySetException("Empty contact book");
        }
    }

    public Contact updateContactNumber(String name, String newNumber) throws EmptySetException, ElementNotFindException {
        Contact updateContact = null;
        if(!contactBook.isEmpty()) {
            for (Contact contact : contactBook) {
                if(contact.getContactName().equalsIgnoreCase(name)) {
                    contact.setContactNumber(newNumber);
                    updateContact = contact;
                    break;
                }
            }
            if(updateContact == null) {
                throw new ElementNotFindException("Contact Not Find");
            }
            return updateContact;
        } else {
            throw new EmptySetException("Empty contact book");
        }
    }
}
