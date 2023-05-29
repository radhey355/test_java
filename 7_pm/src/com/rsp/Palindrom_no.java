package com.rsp;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrom_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number==");
	
		  int n = sc.nextInt();
	        if (isPalindrome(n)) {
	            System.out.println(n + " is a palindrome number.");
	        } else {
	            System.out.println(n + " is not a palindrome number.");
	        }

	        int previousPalindrome = findPreviousPalindrome(n);
	        int nextPalindrome = findNextPalindrome(n);

	        System.out.println("The previous palindrome number of  is " + previousPalindrome);
	        System.out.println("The next palindrome number of is " + nextPalindrome);
	  }
	    public static boolean isPalindrome(int n) {
	        int temp = n;
	        int sum = 0;

	        while (n > 0) {
	            int r = n % 10;
	            n=n/10;
	            sum = sum * 10 + r; 
	        }
	        return temp == sum;
	    }
	    public static int findPreviousPalindrome(int n) {
	        while (!isPalindrome(--n)) {
	            
	        }
	        return n;
	    }
	    public static int findNextPalindrome(int n) {
	        while (!isPalindrome(++n)) {
	        }
	        return n;
	    }

}



