package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockTest {

    @Test
    void getX() {
        Mock mock = new Mock(0,0);
        assertEquals(mock.getX(), 0);
        assertEquals(mock.getY(), 0);
    }
}