package com.codedifferently.partB;

import com.codedifferently.partB.exceptions.OverlappingReservationException;
import com.codedifferently.partB.exceptions.PaymentFailureException;

public class Plane {
    private String destination;
    private String departureTime;
    private Reservation[] reservations;

    private Double costOfFlight;

    public Plane(String destination, String departureTime, Double costOfFlight, Integer numberOfSeats){
        this.destination = destination;
        this.departureTime = departureTime;
        this.costOfFlight = costOfFlight;
        this.reservations = new Reservation[numberOfSeats];
    }

    public Reservation makeReservation(Double payment, Integer seatRequest) throws PaymentFailureException, OverlappingReservationException {
        if (payment < costOfFlight)
            throw new PaymentFailureException("Not enough money");
        if(reservations[seatRequest] != null)
            throw new OverlappingReservationException("Seat is already reserved");
        Reservation reservation = new Reservation(payment, seatRequest);
        reservations[seatRequest] = reservation;
        return reservation;
    }

    public Integer getNumberOfSeats(){
        return reservations.length;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
