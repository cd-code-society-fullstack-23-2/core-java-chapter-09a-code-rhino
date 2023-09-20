package com.codedifferently.partB;

import com.codedifferently.partB.exceptions.OverlappingReservationException;
import com.codedifferently.partB.exceptions.PaymentFailureException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlaneTest {

    private Plane plane;

    @BeforeEach
    public void setUp() {
        plane = new Plane("Paris", "10:00 AM", 500.0, 10);  // Assuming there are 10 seats in the plane.
    }

    @Test
    public void testMakeReservationValid() {
        assertDoesNotThrow(() -> plane.makeReservation(600.0, 1)); // Valid seat and payment
    }

    @Test
    public void testMakeReservationWithLowPayment() {
        assertThrows(PaymentFailureException.class, () -> plane.makeReservation(400.0, 1));
    }

    @Test
    public void testMakeReservationWithTakenSeat() throws PaymentFailureException, OverlappingReservationException {
        plane.makeReservation(600.0, 2);  // Reserve the seat
        assertThrows(OverlappingReservationException.class, () -> plane.makeReservation(600.0, 2)); // Try reserving the same seat again
    }

    @Test
    public void testMakeReservationWithOutOfBoundsSeat() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> plane.makeReservation(600.0, 11)); // Invalid seat number (higher than total seats)
    }
}
