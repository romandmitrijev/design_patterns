package com.sda.design_patterns.facade;

public class HotelBooking implements BookingInterface {
    @Override
    public void book(BookingInfo bookingInfo) {
        System.out.println("Hotel booked");
    }
}
