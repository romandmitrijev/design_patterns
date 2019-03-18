package com.sda.design_patterns.facade;

public class TravelFacade {

    private BookingInterface flightbooking;
    private BookingInterface trainBooking;
    private BookingInterface hotelBooking;

    enum BookingType{
        Flight,Train,Hotel,Fligh_And_Hotel,Train_And_Hotel
    }

    public TravelFacade (){
        flightbooking = new FlightBooking();
        trainBooking = new TrainBooking();
        hotelBooking = new HotelBooking();
    }

    public void book (BookingType type, BookingInfo info){
        switch  (type){
            case Flight:
                flightbooking.book(info);
                break;
            case Hotel:
                hotelBooking.book(info);
                break;
            case Train:
                trainBooking.book(info);
                break;
            case Fligh_And_Hotel:
                flightbooking.book(info);
                hotelBooking.book(info);
                break;
            case Train_And_Hotel:
                trainBooking.book(info);
                hotelBooking.book(info);
                break;
        }
    }
}
