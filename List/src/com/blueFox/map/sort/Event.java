package com.blueFox.map.sort;

public class Event {
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
    public String toString() {
        return "[eventId: " + eventId + ", eventName: " + eventName + ", eventAttraction: " + eventAttraction + "]";
    }

    
}
