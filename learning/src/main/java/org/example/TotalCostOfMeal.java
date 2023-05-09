package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TotalCostOfMeal {

    public static void main(String[] args) {
        /*
        tip = tipRate * listedMealPrice;
        tax = taxRate * listedMealPrice;
        result = tip+tax+listedMealPrice;
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Meal Price: ");
        double listedMealPrice = sc.nextDouble();

        System.out.println("Enter TaxRate: ");
        double taxRate = sc.nextDouble();

        System.out.println("Enter TipRate: ");
        double tipRate = sc.nextDouble();

        // Sanitizing the inputs
        Double[] sanitizedInputs = inputSanityChecker(listedMealPrice,tipRate,taxRate);
        Arrays.stream(sanitizedInputs).forEach(System.out::println); // Arrays is used to create a stream from Array of doubles.
                                                                    // from the stream we used forEach method to iterate over the stream elements

        // Let's convert this array into List and do some list operations and print the string
        List<Double> sanitizedInputList = Arrays.asList(sanitizedInputs);
        var doubling= sanitizedInputList.stream()
                .map(num-> num*2)
                .collect(Collectors.toList()); // to create a new list of doubled integers
        System.out.println(doubling);



        // calculating the final meal cost
        double finalMealPrice = calculateTotalMealPrice(sanitizedInputs);
        System.out.printf("Final Meal Price: %s", finalMealPrice);

    }

    public static  Double[] inputSanityChecker(Double... args){
        Scanner sc = new Scanner(System.in);
        Double listedPrice = args[0];
        Double tipRate = args[1];
        Double taxRate = args[2];


        // sanity check: Meal Price
        while (listedPrice<=0){
            System.out.println("Enter the price of the meal. Price must be >0");
            while (!sc.hasNextDouble()){
                System.out.println("ERROR>> Data Format is Wrong(Meal Price):: ");
                sc.next();
            }
            listedPrice=sc.nextDouble();
        }

        // Sanity Check: tip rate
        while (tipRate<=0){
            System.out.println("Enter the tip Rate. Tip Rate must be >0");
            while (!sc.hasNextDouble()){
                System.out.println("ERROR>> Data Format is Wrong(Tip Rate):: ");
                sc.next();
            }
            tipRate = sc.nextDouble();
        }

        // Sanity Check: Tax Rate
        while (taxRate<=0){
            System.out.println("Enter the Tax Rate. Tax Rate must be >0");
            while (!sc.hasNextDouble()){
                System.out.println("ERROR>> Data Format is Wrong(Tax Rate):: ");
                sc.next();
            }
            taxRate = sc.nextDouble();
        }

        return new Double[]{listedPrice,taxRate,tipRate};


    }

    public static double calculateTotalMealPrice(Double[] args){
        /*
        tip = tipRate * listedMealPrice;
        tax = taxRate * listedMealPrice;
        result = tip+tax+listedMealPrice;
         */

        var listedMealPrice = args[0];
        var taxRate = args[1];
        var tipRate = args[2];

        var tip = tipRate* listedMealPrice;
        var tax = taxRate*listedMealPrice;
        return tip+tax+listedMealPrice;

    }
}
