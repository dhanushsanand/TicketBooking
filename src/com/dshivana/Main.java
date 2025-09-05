package com.dshivana;

import ticket.booking.entities.User;
import ticket.booking.service.UserBookingService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(System.getProperty("user.dir"));
        User user = new User();
        try {
            UserBookingService bookingService = new UserBookingService(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
