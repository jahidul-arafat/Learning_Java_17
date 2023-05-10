package org.example;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hours per week
        // valid input: anything >0
        // sanity check if: 'aa', -1 etc
        System.out.println("Enter hours_per_week: ");
        double hoursPerWeek = sc.nextDouble();
        hoursPerWeek = inputSanityChecker(hoursPerWeek);

        // amount per hour
        // valid input: anything >0
        // sanity check if: 'aa', -1 etc
        System.out.println("Enter amount_per_hour: ");
        double amountPerHour = sc.nextDouble();
        amountPerHour = inputSanityChecker(amountPerHour);

        // vacation days
        // if half day, then 0.5
        // valid input: anything >0
        System.out.println("Enter Vacation days availed: ");
        double vacationDays = sc.nextDouble();
        vacationDays = inputSanityChecker(vacationDays);

        // Efficient-01
        // dont call the function if any of the 'hoursPerWeek' or 'amountPerHour' ==0
        if (hoursPerWeek==0||amountPerHour==0) return; // means exit from the main()

        double yearlyEarning_gross = salaryCalculator(hoursPerWeek,amountPerHour,vacationDays);
        System.out.printf("Yearly Earning: %s\n",yearlyEarning_gross);


    }

    public static double inputSanityChecker(double input){

        Scanner sc = new Scanner(System.in);

        while (input<0){
            System.out.println("Enter Hours Per Week; Must be >0");
            // check the input format error; if the error is there discard the input and be in the loop until the correct formatted
            // data is inputted

            while (!sc.hasNextDouble()){
                System.out.println("ERROR >> Input Format ERROR ...... ");
                // discard the wrong inout data we just entered
                sc.next(); // this will prevent the while loop to be in infinite loop
                            // consume the invalid input
            }
            input = sc.nextDouble();

        }

        return input;
    }



    public static double salaryCalculator(double hoursPerWeek, double amountPerHour, double vacationDays){
        double weeklyEarning = hoursPerWeek * amountPerHour;
        double yearlyEarning = weeklyEarning*52;
        double unpaidHours = vacationDays*8*amountPerHour;
        return yearlyEarning-unpaidHours;

    }
}
