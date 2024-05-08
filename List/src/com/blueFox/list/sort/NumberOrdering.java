package com.blueFox.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.blueFox.list.exception.EmptyListException;

public class NumberOrdering {
    private List<Integer> numberOrdering;

    public NumberOrdering() {
        this.numberOrdering = new ArrayList<>();
    }

    public void addNumber(int number) {
        numberOrdering.add(number);
    }

    public List<Integer> sortAscending() throws EmptyListException {
        List<Integer> numberAscending = new ArrayList<>(numberOrdering);
        if(!numberOrdering.isEmpty()) {
            Collections.sort(numberAscending);
            return numberAscending;
        } else {
            throw new EmptyListException("Empty number list");
        }
    }

    public List<Integer> sortDescending() throws EmptyListException{
        List<Integer> numberDescending = new ArrayList<>(numberOrdering);
        if(!numberOrdering.isEmpty()) {
            numberDescending.sort(Collections.reverseOrder());
            return numberDescending;
        } else {
            throw new EmptyListException("Empty number list");
        }
    }
    
}
