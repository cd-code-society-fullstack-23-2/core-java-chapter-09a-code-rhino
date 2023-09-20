package com.codedifferently.partB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {

    private Reservation reservation;

    @BeforeEach
    public void setUp() {
        reservation = new Reservation(1, 100.0, 5);
    }

    @Test
    public void testConstructor() {
        assertNotNull(reservation);
        assertEquals(1, reservation.getId());
        assertEquals(100.0, reservation.getAmountPaid());
        assertEquals(5, reservation.getSeatNumber());
    }

    @Test
    public void testSetAmountPaid() {
        reservation.setAmountPaid(150.0);
        assertEquals(150.0, reservation.getAmountPaid());
    }

    @Test
    public void testSetSeatNumber() {
        reservation.setSeatNumber(3);
        assertEquals(3, reservation.getSeatNumber());
    }

    @Test
    public void testToString() {
        String expectedString = "Reservation{id=1, amountPaid=100.0, seatNumber=5}";
        assertEquals(expectedString, reservation.toString());
    }
}
