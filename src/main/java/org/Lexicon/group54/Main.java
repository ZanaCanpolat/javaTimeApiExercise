package org.Lexicon.group54;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        
        //Variables
        LocalDate currentDay = LocalDate.now();
        String formattedDate; // Variable that will contain the formatted time
        LocalTime currentTime = LocalTime.now();


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
        LocalDate myBirthday = currentDay;
        System.out.println("My birthday = " + myBirthday +" was a " +myBirthday.getDayOfWeek());

        System.out.println();

        //Exercise 6
        //Setting date to a specific date and extracting the mont
        currentDay = currentDay.plusYears(10);
        currentDay = currentDay.minusMonths(10);
        LocalDate exSixDate = currentDay;
        System.out.println("Current Day + 10 yease - 10 months is = " + exSixDate.getMonth());

        System.out.println();

        //Exercise 7
        // Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and
        // the date from exercise 5. Print out the elapsed years, months and days
        long comparisonDate1 = ChronoUnit.DAYS.between(myBirthday, exSixDate);
        System.out.println("comparisonDate1 = " + comparisonDate1);
        for (int i = 1; i <= comparisonDate1; i++ )
        {
            System.out.println(myBirthday);
            myBirthday = myBirthday.plusDays(1);
        }

        System.out.println();

        //Exercise 8
        //Creating a local time object
        System.out.println("CurrentTime = " + currentTime);

        System.out.println();

        //Exercise 9
        //Extracting nanoseconds from time variable
        System.out.println("Nano seconds:  " +currentTime.getNano());

        System.out.println();

        //Exercise 11
        //Creating a LocalTime object from String using the .parse() method
        String time = ("00:00:00");
        currentTime = LocalTime.parse(time);
        System.out.println("currentTime = " + currentTime);

        System.out.println();

        //Exercise 12
        //Formating localtime to remove nanoseconds
        String formattedTime; // Variable that will contain the formatted time
        currentTime = LocalTime.now();  // Gets current time form java.time

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(" HH:mm:ss ");    // sets the format for how the time should be displayed
        formattedTime = currentTime.format(timeFormatter);
        System.out.println("Formatted time: " + formattedTime);

        System.out.println();

        //Exercise 13
        //Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00
        LocalDateTime currentDateTime;
        currentDateTime = LocalDateTime.of(2018, 04, 05, 10, 00);
        System.out.println("Specific date and time: " + currentDateTime);

        System.out.println();

        //Exercise 14
        //Using DateTimeFormatter format the LocalDateTime object from exercise 13 to a String that should
        // look like this: torsdag 5 april 10:00
        DateTimeFormatter ex14Formatter = DateTimeFormatter.ofPattern("E dd MMM HH:mm");
        String formattedDateTime = currentDateTime.format(ex14Formatter);
        System.out.println("Formatted Date Time: " + formattedDateTime);

        System.out.println();

        //Exercise 15
        //Create a LocalDateTime object by combining LocalDate object and LocalTime object.
        LocalDateTime ex15DateTime;
        ex15DateTime= LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Combining LocalDate and LocalTime: " +ex15DateTime );

    }
   }