package src.structural.facade.booking_facade;

import src.structural.facade.booking_facade.hub.BookingFacade;

public class Main {
    public static void main(String[] args) {

        BookingFacade bookingSystem = new BookingFacade();
        boolean isBookingSuccessful = bookingSystem.bookEvent("Concert", 100.0);
        if (isBookingSuccessful) {
            System.out.println("Enjoy the event!");
        } else {
            System.out.println("Booking failed.");
        }
    }
}

