package com.blueFox.set.basicOperation;

import com.blueFox.exception.EmptySetException;

public class GuestsSetTest {
    public static void main(String[] args) {
        try {
            GuestsSet guestsSet = new GuestsSet();

            // guestsSet.removeGuestByGuestCode(24);
            // System.out.println(guestsSet.getGuests());

            guestsSet.addGuest(1, "Fabiana", 21);
            guestsSet.addGuest(2, "Amanda", 22);
            guestsSet.addGuest(3, "Yasmin", 24);

            System.out.println(guestsSet.guestsTotal());
            
            guestsSet.removeGuestByGuestCode(24);

            System.out.println(guestsSet.getGuests());
        } catch (EmptySetException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
