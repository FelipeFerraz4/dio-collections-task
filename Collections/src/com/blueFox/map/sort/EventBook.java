package com.blueFox.map.sort;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptyMapException;

public class EventBook {
    private Map<LocalDate, Event> eventBook;

    public EventBook() {
        this.eventBook = new HashMap<>();
    }

    public void addBook(LocalDate date, int eventId, String eventName, String eventAttraction) {
        eventBook.put(date, new Event(eventId, eventName, eventAttraction));
    }

    public Map<LocalDate, Event> getEvents() throws EmptyMapException {
        if (eventBook.isEmpty()) {
            throw new EmptyMapException("Empty event book");
        }
        Map<LocalDate, Event> events = new TreeMap<>(eventBook);
        return events;
    }

    public Map<LocalDate, Event> getNearestEvent() throws EmptyMapException, ElementNotFindException{
        if (eventBook.isEmpty()) {
            throw new EmptyMapException("Empty event book");
        }

        Map<LocalDate, Event> events = new TreeMap<>(eventBook);
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDate = null;

        for (LocalDate date : events.keySet()) {
            if (date.isEqual(currentDate) || date.isAfter(currentDate)) {
                nextDate = date;
                break;
            }
        }

        if (nextDate == null) {
            throw new ElementNotFindException("There is not next evnet");
        }

        Map<LocalDate, Event> nearestEvent = new HashMap<>();
        nearestEvent.put(nextDate, eventBook.get(nextDate));

        return nearestEvent;
    }
}
