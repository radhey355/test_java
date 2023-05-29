package com.rsp;

import java.util.Scanner;

public class Prime {
	


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (isPrime(a)) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }

        int previousPrime = findPreviousPrime(a);
        System.out.println("Previous prime number: " + previousPrime);

        int nextPrime = findNextPrime(a);
        System.out.println("Next prime number: " + nextPrime);
    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int findPreviousPrime(int a) {
        int previousNumber = a - 1;

        while (!isPrime(previousNumber)) {
            previousNumber--;
        }

        return previousNumber;
    }

    public static int findNextPrime(int a) {
        int nextNumber = a + 1;

        while (!isPrime(nextNumber)) {
            nextNumber++;
        }

        return nextNumber;

    

}
}