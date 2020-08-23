package com.tawan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Task 2: File Processing (5 marks)
 *
 * Write a program that takes a text file name as a runtime argument.
 * If the text file does not exist, print an error message and terminate the program.
 * Otherwise, have your program calculate the number of characters in the file (ignore any white space) and print the result.
 *
 * @author Tawan Chotikanchinda <hello@tawan.org>
 */
public class Main {
    /**
     * Scanner instance
     *
     * @return Scanner
     */
    private static Scanner input;

    public static void main(String[] args) throws FileNotFoundException {
        // Initial scanner instance
        input = new Scanner(System.in);

        String fileName;

        System.out.println("Enter filename: ");
        fileName = input.nextLine();

        if (fileName == null || fileName.length() < 1) {
            throw new FileNotFoundException("File name may not be empty");
        }

        // Check if file existing
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " file not found");
        }

        // create empty array for data
        BufferedReader dataBuffer = null;
        StringBuilder data = new StringBuilder();    //constructs a string buffer with no characters

        try {
            // Creates a buffering character-input stream
            dataBuffer = new BufferedReader(new FileReader(file));
            // Loop through the data and add to data array
            while (dataBuffer.ready()) {
                String line = dataBuffer.readLine();
                if (line.length() > 0) {
                    data.append(line); // appends line to string buffer
                    data.append("\n"); // line feed
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Print data
        System.out.println("Contents of File: ");
        System.out.println(data.toString());
    }
}
