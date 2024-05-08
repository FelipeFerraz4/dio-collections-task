package com.blueFox.list.sort;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private int personId;
    private String personName;
    private int personAge;
    private double personHeight;
    
    public Person(int personId, String personName, int personAge, double personHeight) {
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
        this.personHeight = personHeight;
    }

    public int getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public double getPersonHeight() {
        return personHeight;
    }

    @Override
    public String toString() {
        return "[personId: " + personId + ", personName: " + personName + ", personAge: " + personAge
                + ", personHeight: " + personHeight + "]";
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(personAge, person.getPersonAge());
    }

}

class ComparatorByHeight implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return Double.compare(person1.getPersonHeight(), person2.getPersonHeight());       
    }

}