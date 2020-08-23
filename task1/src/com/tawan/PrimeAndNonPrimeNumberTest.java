package com.tawan;

import static com.tawan.PrimeNumber.checkPrimeNumber;

public class PrimeAndNonPrimeNumberTest {

    /**
     * Run the number
     *
     * @param args
     */
    public static void main(String[] args) throws Throwable {
        // One prime numbers and one non-prime number
        try {
            checkPrimeNumber(1, 5);
        } catch (PrimeNumberException e) {
            e.printStackTrace();
        }
    }

}
