package org.example;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter some input
        System.out.print("Enter some input: ");
        String input = scanner.nextLine();

        // Check if there is more input in the scanner's buffer
        if (scanner.hasNext()) {
            System.out.println("There is more input in the scanner's buffer");
            // Print the next token in the scanner's buffer
            System.out.println("Next token in the buffer: " + scanner.next());
        } else {
            System.out.println("The scanner's buffer is empty");
        }

    }
}
