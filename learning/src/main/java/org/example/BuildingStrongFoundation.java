package org.example;
// Problem- Build a non-scalable student record to test the Java Data Type and manual user input functionalities
/*
2x Data Types:
(a) Primitive Data Type - this is not an object or reference of an object.
                        - Predefined in the language
Primitive Data Types:
- boolean
- int
- double
- char

Prompt: We often get data types like Integer, Double, Long, Float etc . What are those in comparison to int, double, float
Answer: Integer, Double etc are the classes representing their respective primitive data types. These are also called the wrapper classes

The wrapper classes for the primitive data types are:
-----------------------------------------------------
- Byte - wraps the byte primitive data type
- Short - wraps the short primitive data type
- Integer - wraps the int primitive data type
- Long - wraps the long primitive data type
- Float - wraps the float primitive data type
- Double - wraps the double primitive data type
- Boolean - wraps the boolean primitive data type
- Character - wraps the char primitive data type

Suggestion: If you are using for simple cases, use primitive data type.
            But if need to work with objects, use the wrapper classes.
 */

/*
(b) Reference Data Type - Store memory reference of an object that point to the actual data stored in memory
- String
- Object - the base class for all objects in Java
- Arrays
- Classes
 */


import java.util.Arrays;
import java.util.Scanner;

public class BuildingStrongFoundation {
    public static void main(String[] args) {

        // Example - Primitive Data Type
        // Create a student information
        var stdAge = 15; // java compiler will automatically infer the data type of variable based on the value being assigned to it.
        var stdGPA = 3.92;
        var stdFirstName = "Jahid";
        var stdLastName = "Arafat";
        var hasPerfectAttendance = true;
        var output = String.format("%s %s %s %s %s", stdAge, stdGPA, stdFirstName.charAt(0), stdLastName.charAt(0), stdGPA);
        System.out.println(output);

        // Let's update the GPA - User input required
        // Sanitize the user input - what is the CGPA is negative or >4.00
        // Strategy:
        /*
        - When a user enter an invalid input (i.e. 'aaaa'), that is not double, the hasNextDouble() return false and the ERROR code at else is executed
        - the invalid input still in the scanner's buffer and this would lead the program into infinite loop.
        - To avoid stuck into the infinite loop as it continues to read the same invalid input over and over again, we use sc.next()
        - sc.next() will read the next token as string, but since we are not interested in the value of the invalid input, we simply didnt assign it to any variable.

         */
        Scanner sc = new Scanner(System.in);
        boolean validGPA = false;
        int counter = 0;
        while (!validGPA) {
            // System.out.printf("Any leftover Token at Buffer: %s\n", sc.next());
            System.out.printf("%d > Enter the updated GPA: \n", counter);
            if (sc.hasNextDouble()) {
                System.out.println("Into the Scanner Buffer Testing ...");
                stdGPA = sc.nextDouble();
                if (stdGPA > 0 && stdGPA <= 4.00) {
                    validGPA = true;
                }
            } else {
                System.out.println("ERROR >> You must enter a double value i.e. 3.99");
                var temp = sc.next(); // Trick is here!!! // it will get the value already in the Scanner buffer. Dont ask for new input
                System.out.printf("Temp : %s\n", temp);
            }
            counter++;
        }

        // Prompt: Single line print statement for formatted output in Java
        System.out.printf("%s %s %s %s %s", stdAge, stdGPA, stdFirstName, stdLastName, stdGPA);
        System.out.println();

        // Example - Reference Types
        String msg = "Hello World";
        System.out.println(msg.charAt(1));
        System.out.println();

        int[] numList = {1, 2, 3, 4, 5};     // Array
        Arrays.stream(numList).forEach(System.out::println);


    }
}
