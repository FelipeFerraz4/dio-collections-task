package com.blueFox.list.sort;

import com.blueFox.exception.EmptyListException;

public class PeopleOrderingTest {
    public static void main(String[] args) {
        try {
            PeopleOrdering peopleOrdering = new PeopleOrdering();

            // System.out.println(peopleOrdering.sortByAge());

            // System.out.println(peopleOrdering.sortByHeight());

            peopleOrdering.addPerson(1, "Elen", 30, 1.80);
            peopleOrdering.addPerson(2, "Valentina", 20, 1.65);
            peopleOrdering.addPerson(3, "Bianca", 40, 1.60);
        
            System.out.println(peopleOrdering.sortByAge());

            System.out.println(peopleOrdering.sortByHeight());

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
