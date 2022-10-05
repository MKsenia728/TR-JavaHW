package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input radius : ");
        int radius = scanner.nextInt();
        scanner.nextLine();
        System.out.println("The area of a circle with radius " + radius + " is " + 3.14 * Math.pow(radius,2) + ".\n");

        System.out.print("Input your name : ");
        String userName = scanner.nextLine();
        System.out.println("Hello,  " + userName + "!\n");

        String workString = new String("I study Basic Java!");
        System.out.println("In string \"" + workString + "\" last symbol is \"" + workString.charAt(workString.length() - 1) + "\".\n");

        System.out.println(workString.replace("a","*"));
    }
}