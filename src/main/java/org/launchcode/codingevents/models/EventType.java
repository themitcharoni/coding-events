package org.launchcode.codingevents.models;

public enum EventType {

    CONFERENCE("Conference"),
    MEETUP("Meetup"),
    WORKSHOP("Workshop"),
    SOCIAL("Social");

    private final String displayName;


    public String getDisplayName() {
        return displayName;
    }

    EventType(String displayName) {
        this.displayName = displayName;


    }
}
