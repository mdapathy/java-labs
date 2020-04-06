package com.duminska.lab1jee.EventStorage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.ArrayList;

import static java.sql.Timestamp.valueOf;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    static private Database database;

    @BeforeAll
    static void init() {
        database = new Database(
                DatabaseConnection.createConnection("lab1jee", "userlab", "userlab"));

        database.addEvent(new Event("Test event", valueOf("2020-01-19 12:00:00"),
                        valueOf("2020-01-19 20:00:00"), "Location"),
                new Event("Test event", valueOf("2012-01-19 12:00:00"), valueOf("2012-01-19 20:00:00")),
                new Event("Test event", valueOf("2000-01-19 12:00:00"), valueOf("2000-01-19 20:00:00")));

    }


    @AfterAll
    static void deleteRecords() {
        database.deleteEvent("name", "Test event");
    }

    @Test
    void addEventTest() {
        Event event = new Event("Test event", valueOf("2023-01-19 12:00:00"), valueOf("2023-01-19 20:00:00"));
        database.addEvent(event);

        ArrayList<Event> events = database.getAllEvents();

        assertTrue(events.size() > 0);

        Event lastAdded = events.get(events.size() - 1);

        assertEquals(event, lastAdded);
    }

    @Test
    void getEventsAfterTest() {
        Timestamp time = valueOf("1999-01-12 00:00:00");
        ArrayList<Event> events = database.getEventsAfter(time);

        for (Event e :
                events) {
            assertTrue(e.getStartTime().after(time));
            assertTrue(e.getFinishTime().after(time));

        }

    }


    @Test
    void getEventsBeforeTest() {
        Timestamp time = valueOf("2012-01-12 00:00:00");
        ArrayList<Event> events = database.getEventsBefore(time);

        for (Event e :
                events) {
            assertTrue(e.getStartTime().before(time));
            assertTrue(e.getFinishTime().before(time));

        }

    }


    @Test
    void getEventsBetweenTest() {
        Timestamp time = valueOf("2001-01-12 00:00:00");
        Timestamp time2 = valueOf("2019-01-12 00:00:00");

        ArrayList<Event> events = database.getEventsBetween(time, time2);
        assertTrue(events != null && events.size() != 0);

        for (Event e :
                events) {
            assertTrue(e.getStartTime().after(time));
            assertTrue(e.getFinishTime().before(time2));

        }

    }

    @Test
    void getEventsBetweenImproperParamsTest() {
        Timestamp time = valueOf("2001-01-12 00:00:00");
        Timestamp time2 = valueOf("2019-01-12 00:00:00");

        ArrayList<Event> events = database.getEventsBetween(time2, time);
        assertEquals(0, events.size());

    }


    @Test
    void getEventsWithLocationTest() {
        ArrayList<Event> events = database.getEventsWithLocation("Location1");
        for (Event e :
                events) {
            assertEquals("Location", e.getLocation());

        }
    }

    @Test
    void deleteEventTest() {
        database.addEvent(new Event("Test event", valueOf("2099-01-19 12:00:00"),
                valueOf("2099-01-19 20:00:00"), "Location"));
        ArrayList<Event> events = database.getAllEvents();
        Event event = events.get(events.size() - 1);
        int affected = database.deleteEvent(event);
        assertTrue(affected > 0);

        ArrayList<Event> eventsAfter = database.getAllEvents();
        assertEquals(eventsAfter.size() + 1, events.size());

        for (Event e :
                eventsAfter) {
            assertNotEquals(e, event);

        }
    }

    @Test
    void deleteEventWithFieldsTest() {
        database.addEvent(new Event("Test event", valueOf("2088-01-19 12:00:00"),
                valueOf("2088-01-19 20:00:00"), "Location"));

        ArrayList<Event> events = database.getAllEvents();
        Integer affected = database.deleteEvent("finishTime", "2088-01-19 20:00:00");
        assertTrue(affected > 0);

        ArrayList<Event> eventsAfter = database.getAllEvents();
        assertTrue(eventsAfter.size() < events.size());

        for (Event e :
                eventsAfter) {
            assertNotEquals(e, events.get(events.size() - 1));

        }
    }


    @Test
    void editEventTest() {
        database.addEvent(new Event("Test event", valueOf("2088-01-19 12:00:00"),
                valueOf("2088-01-19 20:00:00"), "Location"));
        ArrayList<Event> events = database.getAllEvents();
        Event lastEvent = events.get(events.size() - 1);
        String prevName = lastEvent.getName(),
                prevLoc = lastEvent.getLocation();

        lastEvent.setFinishTime(valueOf("2089-11-01 12:08:00"));
        lastEvent.setLocation(lastEvent.getLocation() + "Edited");

        database.editEvent(lastEvent);

        ArrayList<Event> eventsAfter = database.getAllEvents();
        assertEquals(eventsAfter.size(), events.size());
        assertEquals(lastEvent, eventsAfter.get(events.size() - 1));

    }

}