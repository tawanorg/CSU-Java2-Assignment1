package com.tawan;

/**
 * Error Handler
 */
public class PrimeNumberException extends Throwable {
    public PrimeNumberException(int number) throws Exception {
        throw new Exception("Oops! " + number + " not prime number");
    }
}
