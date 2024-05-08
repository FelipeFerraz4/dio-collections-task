package com.blueFox.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.blueFox.list.exception.EmptyListException;

public class PeopleOrdering {
    private List<Person> peopleOrdering;

    public PeopleOrdering() {
        this.peopleOrdering = new ArrayList<>();
    }

    public void addPerson(int personId, String personName, int personAge, double personHeight) {
        peopleOrdering.add(new Person(personId, personName, personAge, personHeight));
    }

    public List<Person> sortByAge() throws EmptyListException{
        List<Person> peopleByAge = new ArrayList<>(peopleOrdering);
        if(!peopleOrdering.isEmpty()){
            Collections.sort(peopleByAge);
            return peopleByAge;
        } else {
            throw new EmptyListException("Empty people list");
        }
    }

    public List<Person> sortByHeight() throws EmptyListException {
        List<Person> peopleByHeight = new ArrayList<>(peopleOrdering);
        if (!peopleOrdering.isEmpty()) {
            Collections.sort(peopleByHeight, new ComparatorByHeight());
            return peopleByHeight;
        } else {
            throw new EmptyListException("Empty people list");
        }
    }
    
}
