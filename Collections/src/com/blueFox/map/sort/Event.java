package com.blueFox.map.sort;

public class Event implements Comparable<Event> {
    private int eventId;
    private String eventName;
    private String eventAttraction;
    
    public Event(int eventId, String eventName, String eventAttraction) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventAttraction = eventAttraction;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventAttraction() {
        return eventAttraction;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Event other = (Event) obj;
        if (eventName == null) {
            if (other.eventName != null)
                return false;
        } else if (!eventName.equals(other.eventName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[eventId: " + eventId + ", eventName: " + eventName + ", eventAttraction: " + eventAttraction + "]";
    }

    @Override
    public int compareTo(Event event) {
        // TODO Auto-generated method stub
        return eventName.compareTo(event.getEventName());
    }    
}

