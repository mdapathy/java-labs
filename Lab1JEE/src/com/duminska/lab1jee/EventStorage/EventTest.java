package com.duminska.lab1jee.EventStorage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    static private Timestamp startTime, finTime;
    static private Event event;

    @BeforeAll
    static void init() {
        startTime = Timestamp.valueOf("2020-05-24 19:00:00");
        finTime = Timestamp.valueOf("2020-05-24 22:00:01");
        event = new Event("Name", startTime, finTime, "Location");
    }


    @Test
    void constructorPassedImproperName() {

        assertThrows(IllegalArgumentException.class, () -> {
            Event e = new Event(null, startTime, finTime, "Location");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Event e = new Event("", startTime, finTime, "Location");
        });
    }


    @Test
    void constructorPassedImproperDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            Event e = new Event("Name", finTime, startTime);

        });

    }

    @Test
    void setLocation() {
        String newLocation = "Location2";
        assertDoesNotThrow(() -> {
            event.setLocation(newLocation);
        });
        assertEquals(newLocation, event.getLocation());
    }


    @Test
    void setName() {
        String newName = "Name2";
        assertDoesNotThrow(() -> {
            event.setName(newName);
        });
        assertEquals(newName, event.getName());
    }


    @Test
    void setNameImproperParameters() {

        assertThrows(IllegalArgumentException.class, () -> {
            event.setName(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            event.setName("");
        });

    }


    @Test
    void setStartTime() {
        Event e = new Event("Name", Timestamp.valueOf("2019-01-30 00:00:00"), Timestamp.valueOf("2020-01-01 00:00:00"), "Location");
        Timestamp newStartTime = Timestamp.valueOf("2019-01-21 00:00:00");
        assertDoesNotThrow(() -> {
            e.setStartTime(newStartTime);
        });
        assertEquals(newStartTime, e.getStartTime());
    }

    @Test
    void setStartTimeImproperParameters() {
        Event e = new Event("Name", Timestamp.valueOf("2010-01-30 14:00:00"), Timestamp.valueOf("2020-04-01 19:00:00"), "Location");
        assertThrows(IllegalArgumentException.class, () -> {
            e.setStartTime(Timestamp.valueOf("2040-01-01"));
        });
    }

    @Test
    void setFinTime() {
        Event e = new Event("Name", Timestamp.valueOf("2019-01-31 14:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Location");
        Timestamp newFinishTime = Timestamp.valueOf("2021-01-21 00:00:00");
        assertDoesNotThrow(() -> {
            e.setFinishTime(newFinishTime);
        });
        assertEquals(newFinishTime, e.getFinishTime());
    }

    @Test
    void setFinTimeImproperParameters() {
        Event e = new Event("Name", Timestamp.valueOf("2019-01-30 19:00:00"), Timestamp.valueOf("2020-01-01 14:00:00"), "Location");
        assertThrows(IllegalArgumentException.class, () -> {
            e.setFinishTime(Timestamp.valueOf("1999-01-01"));
        });
    }

}