package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QQQTest {

    @Test
    void getZ() {
        QQQ qqq = new QQQ(1);
        assertEquals(1, qqq.getZ());
    }
}