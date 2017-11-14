package com.vehicles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class MotorcycleTest {

    private static Motorcycle motorcycle;

    @BeforeAll
    public static void setUpTest() {
        motorcycle = new Motorcycle("Suzuki RX", 2007);
    }

    @Test
    public void testCrash() {
        Car car = mock(Car.class);
        assertEquals("crashed", motorcycle.crash(car));
    }

    @Test
    public void testSetEngineIsRunning() {
        motorcycle.setEngineIsRunning(true);
        assertEquals(true, motorcycle.getEngineIsRunning());
        motorcycle.setEngineIsRunning(false);
        assertEquals(false, motorcycle.getEngineIsRunning());

    }

    @Test
    public void testStartEngineNotStarted() {
        motorcycle.setEngineIsRunning(false);
        assertEquals("wrrrr", motorcycle.startEngine());
    }

    @Test
    public void testStartEngineAlreadyRunning() {
        motorcycle.setEngineIsRunning(true);
        assertEquals("already started", motorcycle.startEngine());
    }

    @Test
    public void testStopEngineNotStopped() {
        motorcycle.setEngineIsRunning(true);
        assertEquals("stopped", motorcycle.stopEngine());
    }

    @Test
    public void testStopEngineAlreadyStopped() {
        motorcycle.setEngineIsRunning(false);
        assertEquals("already stopped", motorcycle.stopEngine());
    }

    @Test
    public void testSetAndGetModelName() {
        motorcycle.setModelName("other");
        assertEquals("other", motorcycle.getModelName());
    }

    @Test
    public void testSetAndGetProductionYear() {
        motorcycle.setProductionYear(2020);
        assertEquals(2020, (int) motorcycle.getProductionYear());
    }

    @Test
    public void hasABSSystem() {
        assertEquals(false, motorcycle.hasABSSystem());
    }

}