package src.structural.facade.booking_facade.hub;

import src.structural.facade.booking_facade.components.ConfirmationSystem;
import src.structural.facade.booking_facade.components.PaymentProcessor;
import src.structural.facade.booking_facade.components.TicketAvailability;

public class BookingFacade {
    private TicketAvailability availability;
    private PaymentProcessor paymentProcessor;
    private ConfirmationSystem confirmationSystem;

    public BookingFacade() {
        this.availability = new TicketAvailability();
        this.paymentProcessor = new PaymentProcessor();
        this.confirmationSystem = new ConfirmationSystem();
    }

    public boolean bookEvent(String event, double amount) {
        if (availability.checkAvailability(event)) {
            paymentProcessor.processPayment(amount);
            confirmationSystem.sendConfirmation(event);
            System.out.println("Booking for " + event + " is successful!");
            return true;
        } else {
            System.out.println("Booking for " + event + " is not available.");
            return false;
        }
    }
}

// Client code



