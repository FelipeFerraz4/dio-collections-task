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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contactName == null) ? 0 : contactName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (contactName == null) {
            if (other.contactName != null)
                return false;
        } else if (!contactName.equals(other.contactName))
            return false;
        return true;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    

}
