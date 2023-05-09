package org.example;
/*
*   Command to execute this program
* > java programName.java arg1 arg2
 */
/*
GPT Prompt: Why do we use void and static in the main method?
- void - means the main method would not return anything
- static - means main method belongs to a class, rather than an instance of the class. It cant be instantiated
 */

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class CommandLineArguments {
    public static void main(String @NotNull [] args) {
        System.out.println("Testing the Command Line Argument in Java ...");
        var totalArgument= String.format("Total Number of Arguments Found: %d", args.length);
        System.out.println(totalArgument);
        Arrays.stream(args).forEach(System.out::println);
    }
}
