package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TTTTest {

    @Test
    void getZ() {

        TTT ttt = new TTT(1, 1, 1, 1);
        assertEquals(1, ttt.getZ());
        assertEquals(1, ttt.getF());
        assertEquals(1, ttt.getG());
        assertEquals(1, ttt.getQ());
    }


    @Test
    void go() {
        TTT ttt = new TTT(1, 1, 1, 1);
        assertEquals(1000, ttt.Go());
    }
}