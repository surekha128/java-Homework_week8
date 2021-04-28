package ContainMethods;

import java.util.Scanner;

/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
public class NumbersFromConsole {

    //private boolean True;
    public static void main(String[] args) {
        NumbersFromConsole nc = new NumbersFromConsole();
        nc.setMinimum();
    }

    public boolean setMinimum() {


        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;


        Scanner input = new Scanner(System.in);
       System.out.println("Enter number:  \t");
        int number = input.nextInt();
        int max = input.nextInt();
        int min = input.nextInt();
        while (number <= min) {
           // System.out.println("mininum no:  \t" + min);
            min = number;
            if(min!=number){
                return false;
            }
            break;
        }
      //  number++;
        System.out.println("mininum no:  \t" + min++);
       number++;



        while (number >= max) {
            max = number;
           // System.out.println("maximum no:  \t" + max);
            if(max!=number){
                return false;
            }
            break;
        }
       number++;
        System.out.println("maximum no:  \t" + max++);
return false;
    }

        }
