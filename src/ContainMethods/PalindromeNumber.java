package ContainMethods;
/*
5. Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
 */
import java.util.Scanner;
public class PalindromeNumber {
    public static int reverse(int number) { // missing return?
        int y;
        int n;
        for (n = 0; n <= number; n++) { // parameters
            y = number % 10; // remainder
            number = number / 10; // gets rid of last digit
            n = n * 10 + y; // sets reverse values

            return n; // returns reversed number
        }
        return n;
    }

    public static boolean isPalindrome(int number) {
        int n = reverse(number); // call reverse method
        boolean result ; // declare result
        if (n == number) {
            if (n != number) {
                result = false;
                System.out.println("The number " + number + " is a Palindrome" + ".");
            }
        } else { // incompatible types?
            result = true;
            System.out.println("The number " + number + " is not a " + "Palindrome" + ".");
        }
        return false; // not initialized?
    }

    public static void main(String[] args) {

        System.out.println("Please enter an integer. ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean Final = isPalindrome(number);
        System.out.println(Final);

    }
}

