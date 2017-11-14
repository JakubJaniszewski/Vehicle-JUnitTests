package com.vehicles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

public class CarTest {

    private static Car car;

    @BeforeAll
    public static void setUpTest() {
        car = spy(Car.class);
    }

    @Test
    public void testSetAndGetEngineIsRunning() {
        car.setEngineIsRunning(false);
        assertEquals(false, car.isEngineRunning());
        car.setEngineIsRunning(true);
        assertEquals(true, car.isEngineRunning());
    }

    @Test
    public void testStartEngineNotRunning() {
        car.setEngineIsRunning(false);
        assertEquals("wrrrr", car.startEngine());
    }

    @Test
    public void testStartEngineAlreadyRunning() {
        car.setEngineIsRunning(true);
        assertEquals("already running", car.startEngine());
    }

    @Test
    public void testStopEngineNotStopped() {
        car.setEngineIsRunning(true);
        assertEquals("stopped", car.stopEngine());
    }

    @Test
    public void testStopEngineAlreadyStopped() {
        car.setEngineIsRunning(false);
        assertEquals("already stopped", car.stopEngine());
    }

    @Test
    public void testSetAndGetModelName() {
        car.setModelName("other");
        assertEquals("other", car.getModelName());
    }

    @Test
    public void testSetAndGetABSSystem() {
        car.setHasABS(false);
        assertEquals(false, car.hasABSSystem());
        car.setHasABS(true);
        assertEquals(true, car.hasABSSystem());
    }

    @Test
    public void testSetAndGetProductionYear() {
        car.setProductionYear(2030);
        assertEquals(2030, (int) car.getProductionYear());
    }
}