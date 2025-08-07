package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //Exercise 3: LocalDateTime and DateTimeFormatter
        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        System.out.println("Default format: "+ event);
        System.out.println("Custom format: "+ event.format(dtf));

        //Prediction: Default format: 2025-11-27 19:0:0 \n Custom format: NOV 27, 2025 at 7:00 PM
        //Actual:
    }
}