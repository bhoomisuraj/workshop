package com.xworkz.ticketbooking.runner;

import com.xworkz.ticketbooking.things.TicketBookingDetails;

public class TicketBookingRunner {
    public static void main(String[] args) {
        TicketBookingDetails bookingDetails = new TicketBookingDetails();
        bookingDetails.name = "bhoomika";
        bookingDetails.contactNumber = 968626656L;
        bookingDetails.email = "bhoomika@gmail.com";
        bookingDetails.ticketPrice = 120;
        bookingDetails.numberOfSeats = 49;
        System.out.println("name is:"+bookingDetails.name);
        System.out.println("contactNumber:"+bookingDetails.contactNumber);
        System.out.println("email:"+bookingDetails.email);
        System.out.println("ticketPrice:"+bookingDetails.ticketPrice);
        System.out.println("numberOfSeat:"+bookingDetails.numberOfSeats);
    }
}
