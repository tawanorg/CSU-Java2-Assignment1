package com.tawan;

import static com.tawan.PrimeNumber.checkPrimeNumber;

public class PrimeNumberTest {

    /**
     * Run the number
     *
     * @param args
     */
    public static void main(String[] args) throws Throwable {
        // Two prime numbers
        try {
            checkPrimeNumber(1, 3);
        } catch (PrimeNumberException e) {
            e.printStackTrace();
        }
    }


}
