package com.vehicles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class JaguarTest {

    private static Jaguar jaguar;

    @BeforeAll
    public static void initJaguar() {
        jaguar = new Jaguar("Daimler", 1974, false);
    }

    @Test
    public void testJaguarIsNotNull() {
        assertNotNull(jaguar);
    }

}