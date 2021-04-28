package ContainMethods;

import java.util.Scanner;

/*
12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */
public class PrimeOrNot {
    public static void main(String[] args) {
        PrimeOrNot obj = new PrimeOrNot();
        obj.m1();
    }

    public void m1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = scan.nextInt();
        /*if(a>1)
        {*/
           // System.out.println(" is a prime number\t");
        if (a<= 1) {
            System.out.println(" is a not prime number\t");

        for (int i = 2; i< a; i++) {
            if (a % i == 0) {
                System.out.println(" is a not prime number\t");
            }
        }
        }

    }
}


