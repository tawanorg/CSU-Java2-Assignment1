package com.tawan;

/**
 * Task 1: Exception Handling (5 marks)
 *
 * @author Tawan Chotikanchinda <hello@tawan.org>
 */
public class PrimeNumber {

    /**
     * Find prime number from 2 arguments
     * @param firstNumber number
     * @param secondNumber number
     * @throws Throwable
     * @return Print prime number
     */
    public static void checkPrimeNumber(int firstNumber, int secondNumber) throws Throwable {
        if (isPrimeNumber(firstNumber)) {
            throw new PrimeNumberException(firstNumber);
        }

        if (isPrimeNumber(secondNumber)) {
            throw new PrimeNumberException(secondNumber);
        }

        System.out.println(firstNumber + " and " + secondNumber + " are prime number");
    }

    /**
     * Find prime number
     * @param number
     * @return number status prime or non-prime
     */
    public static boolean isPrimeNumber(int number) {
        boolean flag = false;

        for(int i = 2; i <= number/2; ++i) {
            // condition for non prime number
            if(number % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
