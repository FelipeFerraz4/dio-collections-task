package com.blueFox.set.basicOperation;

public class Guest {
    private int guestId;
    private String guestName;
    private int guestCode;
    
    public Guest(int guestId, String guestName, int guestCode) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.guestCode = guestCode;
    }

    public int getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getGuestCode() {
        return guestCode;
    }

    @Override
    public String toString() {
        return "[guestId: " + guestId + ", guestName: " + guestName + ", guestCode: " + guestCode + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + guestCode;
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
        Guest other = (Guest) obj;
        if (guestCode != other.guestCode)
            return false;
        return true;
    }

}
