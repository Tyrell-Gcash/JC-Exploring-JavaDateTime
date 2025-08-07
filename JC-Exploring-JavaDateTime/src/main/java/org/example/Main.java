package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        //Exercise 6: Period - Measuring a Span of Time
        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(date1, date2);

        System.out.print("The period between the two dates is: ");
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, and ");
        System.out.println(period.getDays() + " days.");

        //Prediction: The period between the two dates is: 2 years, 4 months, and 5 days. \n
        //Actual:
    }
}