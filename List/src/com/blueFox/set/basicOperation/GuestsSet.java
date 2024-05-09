package com.blueFox.set.basicOperation;

import java.util.HashSet;
import java.util.Set;

import com.blueFox.set.exception.EmptySetException;

public class GuestsSet {
    private Set<Guest> guestsSet;

    public GuestsSet() {
        this.guestsSet = new HashSet<>();
    }

    public void addGuest(int guestId, String guestName, int guestCode) {
        guestsSet.add(new Guest(guestId, guestName, guestCode));
    }

    //Precisa adicionar uma exception quando não existe esse guestCode
    public void removeGuestByGuestCode(int guestCode) throws EmptySetException {
        Guest guestToRemove = null;
        if(!guestsSet.isEmpty()) {
            for (Guest guest : guestsSet) {
                if(guest.getGuestCode() == guestCode) {
                    guestToRemove = guest;
                    break;
                }
            }
            guestsSet.remove(guestToRemove);
        } else {
            throw new EmptySetException("Empty guest set");
        }
    }

    public int guestsTotal() {
        return guestsSet.size();
    }

    public Set<Guest> getGuests() throws EmptySetException {
        if(!guestsSet.isEmpty()) {
            return guestsSet;
        } else {
            throw new EmptySetException("Empty guest set");
        }
    }
    
}
