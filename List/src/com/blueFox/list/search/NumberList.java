package com.blueFox.list.search;

import java.util.ArrayList;
import java.util.List;

import com.blueFox.list.exception.EmptyListException;

public class NumberList {
    private List<Integer> numberList;

    public NumberList() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numberList.add(number);
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer integer : numberList) {
            sum += integer;
        }
        return sum;
    }

    public Integer getLargestNumber() throws EmptyListException {
        int largestNumber = Integer.MIN_VALUE;
        if(!numberList.isEmpty()) {
            for (Integer integer : numberList) {
                if(integer > largestNumber) {
                    largestNumber = integer;
                }
            }
            return largestNumber;
        } else {
            throw new EmptyListException("Empty number list");
        }
    }

    public Integer getSmallestNumber() throws EmptyListException {
        int smallestNumber = Integer.MAX_VALUE;
        if(!numberList.isEmpty()) {
            for (Integer integer : numberList) {
                if(integer < smallestNumber) {
                    smallestNumber = integer;
                }
            }
            return smallestNumber;
        } else {
            throw new EmptyListException("Empty number list");
        }
    }

    public List<Integer> getNumbers() throws EmptyListException {
        if(!numberList.isEmpty()) {
            return numberList;
        } else {
            throw new EmptyListException("Empty number list");
        }
    }

}
