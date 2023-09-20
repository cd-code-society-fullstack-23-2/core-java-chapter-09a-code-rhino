package com.codedifferently.partB;

public class Reservation {
    private static int idCount = 1;
    private Integer id;
    private Double amountPaid;
    private Integer seatNumber;

    public Reservation(Double amountPaid, Integer seatNumber){
        this.id = idCount++;
        this.amountPaid = amountPaid;
        this.seatNumber = seatNumber;
    }

    public Reservation(Integer id,Double amountPaid, Integer seatNumber){
        this.id = id;
        this.amountPaid = amountPaid;
        this.seatNumber = seatNumber;
    }

    public Integer getId() {
        return id;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", amountPaid=" + amountPaid +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
