package com.blueFox.list.search;

import com.blueFox.exception.EmptyListException;

public class NumberListTest {
    public static void main(String[] args) {
        try {
            NumberList numberList = new NumberList();
            // System.out.println(numberList.getLargestNumber());
            // System.out.println(numberList.getSmallestNumber());
            // System.out.println(numberList.getNumbers());

            numberList.addNumber(0);
            numberList.addNumber(1);
            numberList.addNumber(2);
            numberList.addNumber(3);

            System.out.println(numberList.calculateSum());
            System.out.println(numberList.getLargestNumber());
            System.out.println(numberList.getSmallestNumber());
            System.out.println(numberList.getNumbers());
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
