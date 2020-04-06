package com.duminska.lab1jee.EventStorage;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Class that works with events in database
 */
public class Database {
    /**
     * Connection to postgres database
     */
    private Connection connection;
    /**
     * Columns present in the database
     */
    final private String columns = "id,  name, starttime, finishtime, location ";

    /**
     * @param connection connection to postgres database
     */
    Database(Connection connection) {
        this.connection = connection;
    }

    /**
     * @return all events in the database
     */
    public ArrayList<Event> getAllEvents() {
        return selectQueryHelper("SELECT id, " + columns + "FROM event");
    }

    /**
     * @param e events to be added
     */
    public void addEvent(Event... e) {
        for (Event event :
                e) {
            String properties = "'" + String.join("' , '", event.getName(),
                    event.getStartTime().toString(), event.getFinishTime().toString(),
                    (event.getLocation() == null) ? "" : event.getLocation()) + "'";

            try {
                Statement st = connection.createStatement();
                ResultSet res = st.executeQuery("INSERT INTO event ( name, starttime, finishtime, location ) " +
                        "VALUES ( " + properties + " ) RETURNING id;");

                res.next();

                event.setId(res.getInt("id"));

            } catch (Exception exception) {
                System.err.println("Got an exception!\n" + exception.getMessage());
            }

        }
    }

    /**
     * @param query query to execute
     * @return amount of fields affected
     */
    private int nonReturningQueryHelper(String query) {
        int res = 0;
        try {
            Statement st = connection.createStatement();
            res = st.executeUpdate(query);

        } catch (Exception e) {
            System.err.println("Got an exception!\n" + e.getMessage());
        }

        return res;
    }

    /**
     * @param query select type query to execute
     * @return arraylist of events that satisfy query's results
     */
    private ArrayList<Event> selectQueryHelper(String query) {
        ArrayList<Event> events = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String location = rs.getString("location");

                Timestamp startTime = rs.getTimestamp("starttime");
                Timestamp finishTime = rs.getTimestamp("finishtime");
                events.add(new Event(id, name, startTime, finishTime, location));
            }
            st.close();

        } catch (Exception e) {
            System.err.println("Got an exception!\n" + e.getMessage());
        }
        return events;
    }

    /**
     * @param after timestamp
     * @return events that start after the timestamp
     */
    public ArrayList<Event> getEventsAfter(Timestamp after) {
        return selectQueryHelper("SELECT " + columns + "FROM event WHERE starttime > '" + after + "';");

    }

    /**
     * @param before timestamp
     * @return events that finish before the timestamp
     */
    public ArrayList<Event> getEventsBefore(Timestamp before) {
        return selectQueryHelper("SELECT " + columns + "FROM event WHERE finishtime < '" + before + "';");
    }

    /**
     * @param before timestamp
     * @param after  timestamp
     * @return events that occur between the timestamps
     */
    public ArrayList<Event> getEventsBetween(Timestamp before, Timestamp after) {
        if (after.before(before)) {
            return new ArrayList<>(0);
        }
        return selectQueryHelper("SELECT " + columns + "FROM event WHERE finishtime < '" + after + "' AND starttime > '" + before + "';");
    }


    /**
     *
     * @param location location
     * @return get events with specified location
     */
    public ArrayList<Event> getEventsWithLocation(String location) {
        return selectQueryHelper("SELECT  " + columns + "FROM event WHERE location='" + location + "';");

    }

    /**
     * @param event event to be deleted
     * @return amount of rows affected
     */
    public int deleteEvent(Event event) {
        if (event.getId() == null) {
            throw new IllegalArgumentException("Cannot delete an event without id");
        }
        return nonReturningQueryHelper("DELETE FROM event WHERE id=" + event.getId());
    }

    /**
     *
     * @param field name of the field
     * @param value value of the field
     * @return  amount of rows affected
     */
    public int deleteEvent(String field, String value) {
        Field[] fields = Event.class.getDeclaredFields();
        for (Field f :
                fields) {
            if (f.getName().toLowerCase().equals(field.toLowerCase())) {
                return nonReturningQueryHelper("DELETE FROM event WHERE " + field.toLowerCase() + "='" + value + "';");
            }
        }
        throw new IllegalArgumentException("Cannot proceed field " + field);
    }

    /**
     *
     * @param event event to be edited
     * @return  amount of rows affected
     */
    public int editEvent(Event event) {
        if (event.getId() == null) {
            throw new IllegalArgumentException("Cannot edit an event without id");
        }
        return nonReturningQueryHelper("UPDATE event SET " +
                "name='" + event.getName() +
                "', location='" + event.getLocation() +
                "', starttime='" + event.getStartTime() +
                "', finishtime='" + event.getFinishTime() +
                "' WHERE id=" + event.getId());
    }


}
