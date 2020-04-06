package com.duminska.lab1jee.EventStorage;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * Class that represent an event object consisting of
 * name, date and location
 */
public class Event {
    /**
     * Id of the record in database
     */
    private Integer id;

    /**
     * Represent name and location of the event
     */
    private String name, location;

    /**
     * Represents date of the event
     */
    private Timestamp startTime, finishTime;

    /**
     * Checks if passed parameters can be used to create an event object
     *
     * @param name      name to be set
     * @param startTime start time to be set
     * @return true finishTime is after the startTime
     * and name is not empty
     */
    private boolean accept(String name, Timestamp startTime, Timestamp finishTime) {
        return name != null && startTime != null && finishTime != null
                && name.length() != 0 && finishTime.after(startTime);
    }

    /**
     * Constructor
     *
     * @param name       name
     * @param startTime  start time
     * @param finishTime finish time
     */
    public Event(String name, Timestamp startTime, Timestamp finishTime) {
        if (!accept(name, startTime, finishTime)) {
            throw new IllegalArgumentException("Your parameters aren't suitable");
        }
        this.id = null;
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.location = "";
    }


    /**
     * Constructor from database record
     *
     * @param name name
     */
    Event(int id, String name, Timestamp startTime, Timestamp finishTime, String location) {
        if (!accept(name, startTime, finishTime)) {
            throw new IllegalArgumentException("Your parameters aren't suitable");
        }

        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.location = location;
    }


    /**
     * @param name     name
     * @param location location
     */
    public Event(String name, Timestamp startTime, Timestamp finishTime, String location) {
        if (!accept(name, startTime, finishTime)) {
            throw new IllegalArgumentException("Your parameters aren't suitable");
        }
        this.id = null;
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.location = location;
    }


    /**
     * @param finishTime time to set
     */
    public void setFinishTime(Timestamp finishTime) {
        if (!accept(name, startTime, finishTime)) {
            throw new IllegalArgumentException("Your parameters aren't suitable");
        }
        this.finishTime = finishTime;
    }

    /**
     * @param startTime time to set
     */
    public void setStartTime(Timestamp startTime) {
        if (!accept(name, startTime, finishTime)) {
            throw new IllegalArgumentException("Your parameters aren't suitable");
        }
        this.startTime = startTime;
    }

    /**
     * @param id id of the record
     */
    void setId(int id) {
        this.id = id;
    }

    /**
     * @param location date to set
     */
    public void setLocation(String location) {
        if (!accept(name, startTime, finishTime)) {
            throw new IllegalArgumentException("Your parameters aren't suitable");
        }
        this.location = location;
    }

    /**
     * @param name date to set
     * @return true is could change the name
     */
    public void setName(String name) {
        if (!accept(name, startTime, finishTime)) {
            throw new IllegalArgumentException("Your parameters aren't suitable");
        }
        this.name = name;

    }

    /**
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return date
     */
    public Timestamp getStartTime() {
        return startTime;
    }

    /**
     * @return finish time
     */
    public Timestamp getFinishTime() {
        return finishTime;
    }


    /**
     * @return id of the record
     */
    Integer getId() {
        return id;
    }

    /**
     * @return string representing the object
     */
    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date=" + startTime +
                '}';
    }

    /**
     * @return true if objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return name.equals(event.name) &&
                location.equals(event.location) &&
                startTime.equals(event.startTime) && Objects.equals(event.id, this.id);
    }

    /**
     * @return hash of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, location, startTime);
    }


}
