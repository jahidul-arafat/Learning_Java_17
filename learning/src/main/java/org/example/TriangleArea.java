package org.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, height;
        System.out.println("Enter base: ");
        base = sc.nextDouble();

        System.out.println("Enter height: ");
        height = sc.nextDouble();

        // get the sanitize output from the sanitization function
        double[] sanitizedInput = sanityCheck(base,height);


        // with the attributes call the areaCalculator() function
        var area = calculateTriangleArea(sanitizedInput[0], sanitizedInput[1]);
        System.out.printf("Calculated Area: %s\n",area);
    }

    @Contract("_ -> new")
    public static double @NotNull [] sanityCheck(double @NotNull ... args){
        Scanner sc = new Scanner(System.in);

        double base=args[0];
        double height=args[1];

        // input validation for base
        while (base <= 0) {
            System.out.println("Enter the base of the Triangle (must be >0)");
            while (!sc.hasNextDouble()) {
                System.out.println("ERROR- Invalid input/base. Enter a valid one");
                sc.next(); // Trick // to exit the while loop // to avoid infinity
            }
            base = sc.nextDouble();

        };

        // input validation for height
        while (height <= 0) {
            System.out.println("Enter the height of the Triangle (must be >0)");
            while (!sc.hasNextDouble()) {
                System.out.println("ERROR - Invalid input/height. Enter a valid one");
                sc.next(); // Trick // to exit the while loop // to avoid infinity
            }
            height = sc.nextDouble();
        } ;

        return new double[]{base, height};
    }

    public static double calculateTriangleArea(double base, double height){
        return 0.5*base*height;

    }
}
