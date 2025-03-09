package main;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Accept user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Perform a simple calculation
        int result = number * 2;
        System.out.println("Double of " + number + " is " + result);
        
        scanner.close();
    }
}
