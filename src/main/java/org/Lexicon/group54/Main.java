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

    }
   }