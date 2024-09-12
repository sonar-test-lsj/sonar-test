package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QQQTest {

    @Test
    void getZ() {
        QQQ qqq = new QQQ(1,1,1,1);
        assertEquals(1, qqq.getZ());
        assertEquals(1, qqq.getF());
        assertEquals(1, qqq.getG());
        assertEquals(1, qqq.getQ());
    }


}