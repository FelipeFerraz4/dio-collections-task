package com.blueFox.list.sort;

import com.blueFox.list.exception.EmptyListException;

public class NumberOrderingTest {
    public static void main(String[] args) {
        try {
            NumberOrdering numberOrdering = new NumberOrdering();

            numberOrdering.addNumber(7);
            numberOrdering.addNumber(0);
            numberOrdering.addNumber(1);
            numberOrdering.addNumber(2);
            numberOrdering.addNumber(3);

            System.out.println(numberOrdering.sortAscending());
            System.out.println(numberOrdering.sortDescending());


        } catch (EmptyListException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
