package com.vehicles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TeslaTest {

    private static Tesla tesla;

    @BeforeAll
    public static void setUpTest() {
        tesla = new Tesla("Model X", 2016, true);
    }

    @Test
    public void testIsTeslaNotNull() {
        assertNotNull(tesla);
    }

    @Nested
    class testTeslaEngine {
        @Test
        public void testNoPowerStartEngine() {
            tesla.setBatteryStatus(0);
            assertEquals("no power", tesla.startEngine());
        }

        @Test
        public void testStartEngineWithPower() {
            tesla.setBatteryStatus(10);
            assertEquals("wrrr", tesla.startEngine());
        }
    }

    @Nested
    class testTeslaBattery {
        @Test
        public void testSetAndGetBatteryStatus() {
            tesla.setBatteryStatus(0);
            assertEquals(0, (int) tesla.getBatteryStatus());
        }

        @Test
        public void testChargeBattery() {
            tesla.setBatteryStatus(0);
            tesla.chargeBattery(1);
            assertEquals(1, (int) tesla.getBatteryStatus());
        }

        @Test
        public void testChargeBatteryOver100() {
            tesla.setBatteryStatus(0);
            tesla.chargeBattery(101);
            assertEquals(100, (int) tesla.getBatteryStatus());
        }
    }

    @Test
    public void testOutrun() {
        VehicleInterface vehicle = mock(Jaguar.class);
        assertEquals("outrunned", tesla.outrun(vehicle));
    }
}