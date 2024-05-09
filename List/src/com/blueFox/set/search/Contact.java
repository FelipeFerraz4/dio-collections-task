package com.blueFox.set.search;

public class Contact {
    private int contactId;
    private String contactName;
    private String contactNumber;
    
    public Contact(int contactId, String contactName, String contactNumber) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public int getContactId() {
        return contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "[contactId: " + contactId + ", contactName: " + contactName + ", contactNumber: " + contactNumber
                + "]";
    }

}
