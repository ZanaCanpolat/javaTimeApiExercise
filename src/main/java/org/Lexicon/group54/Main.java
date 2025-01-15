package org.Lexicon.group54;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        
        //Variables
        LocalDate currentDay = LocalDate.now();
        String formattedDate; // Variable that will contain the formatted time


        // Exercise 1
        // Creating a local date and printing
        System.out.println("Exercise 1: ");
        System.out.println("currentDay = " + currentDay);

        System.out.println();
        
        // Exercise 2
        // Creating a local date and printing
        System.out.println("Exercise 2: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" E dd MMM ");    // sets the format for how the time should be displayed
        formattedDate = currentDay.format(formatter);
        System.out.println(LocalDate.now() + " " + formattedDate);

        System.out.println();

        //Exercise 3
        // Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
        System.out.println("Exercise 3: ");
        currentDay = LocalDate.of(2025, 01,13);
        for (int i = 1; i <= 7; i++)
        {
            currentDay =currentDay.plusDays(1);
            System.out.println("currentDay = " + currentDay);
        }

        System.out.println();

        // Exercise 4
        // Create a LocalDate object from a String by using the .parse() method.
        System.out.println("Exercise 4: ");
        currentDay = LocalDate.parse("2025-01-01");
        System.out.println("currentDay = " + currentDay);

        System.out.println();

        //Exercise 5
        // Extract the day from a specific date
        currentDay = LocalDate.of(1977,04,23);
        System.out.println("My birthday = " + currentDay +" was a " +currentDay.getDayOfWeek());


    }
   }