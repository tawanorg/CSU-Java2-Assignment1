package com.tawan;

import static com.tawan.PrimeNumber.checkPrimeNumber;

public class NonPrimeNumberTest {

    /**
     * Run the number
     *
     * @param args
     */
    public static void main(String[] args) throws Throwable {
        // Two non-prime numbers
        try {
            checkPrimeNumber(50, 100);
        } catch (PrimeNumberException e) {
            e.printStackTrace();
        }
    }

}
