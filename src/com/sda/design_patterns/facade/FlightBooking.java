package com.sda.design_patterns.facade;

public class FlightBooking implements BookingInterface {
    @Override
    public void book(BookingInfo bookingInfo) {
        System.out.println("Flight booked");
    }
}
