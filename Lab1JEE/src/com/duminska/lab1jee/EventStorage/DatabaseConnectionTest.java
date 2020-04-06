package com.duminska.lab1jee.EventStorage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DatabaseConnectionTest {

    @Test
    void createConnection() {
        assertNotNull(DatabaseConnection.createConnection("lab1jee", "userlab", "userlab"));
    }

}