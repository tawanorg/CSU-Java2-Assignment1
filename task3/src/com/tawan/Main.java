package com.tawan;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program that allows a user to create and display rectangle objects.
 * You should write your own Rectangle class for this purpose.
 * Your program should have the following main menu:
 *
 * @author Tawan Chotikanchinda <hello@tawan.org>
 */

public class Main {

    public static ArrayList<Rectangle> Rectangles = new ArrayList<Rectangle>();
    public static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuOption = 0;
        boolean programStart = true;
        while (programStart) {

            System.out.println("## Rectangle Program ##");
            System.out.println("1. Enter rectangle details");
            System.out.println("2. Show all rectangles");
            System.out.println("3. Exit program");
            System.out.println("##  ------  ##");

            menuOption = inputScanner.nextInt();

            switch (menuOption) {
                case 1 -> enterRectangleDetails();
                case 2 -> showAllRectangles();
                case 3 -> {
                    programStart = false;
                    System.out.println("Program stopped");
                }
            }
        }
    }

    /**
     * Print out the length, width and area of each rectangle to two decimal places,
     */
    private static void showAllRectangles() {
        System.out.println("## " + Rectangles.size() + " Rectangles ##");
        for (Rectangle rectangle : Rectangles) {
            System.out.println(rectangle);
        }
        System.out.println("##  ------  ##");
    }

    /**
     * Ask the user for a length in centimetres (a float) and a width in centimetres (a float
     * And create rectangle
     */
    private static void enterRectangleDetails() {
        boolean startProgram = true;

        while (startProgram) {
            try {
                // Ask the user for a length in centimetres (a float) and a width in centimetres (a float)
                System.out.println("Enter a length in centimetres (a float)");
                Float rectangleLength = inputScanner.nextFloat();

                System.out.println("Enter a width in centimetres (a float)");
                Float rectangleWidth = inputScanner.nextFloat();

                try {
                    // create a new rectangle.
                    Rectangle rectangle = new Rectangle(rectangleWidth, rectangleLength);

                    // Print created rectangle
                    System.out.println("Rectangle Width: " + rectangle.getWidth());
                    System.out.println("Rectangle Area: " + rectangle.area());
                    // Add created rectangle to array
                    Rectangles.add(rectangle);
                    // Stop program
                    startProgram = false;

                } catch (Exception e) {
                    System.out.println("Unable to create rectangle: " + e.getMessage());
                }
            } catch (InputMismatchException e) {
                inputScanner.next();
                System.out.print("That’s incorrect rectangle value. Try again:");
            }
        }

    }
}
