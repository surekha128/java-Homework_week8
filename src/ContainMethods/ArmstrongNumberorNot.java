package ContainMethods;

import java.util.Scanner;

/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

public class ArmstrongNumberorNot {

    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: \t");
        int num, remainder, sum = 0, temp=0;
        num=scan.nextInt();

        temp = num;
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            sum = sum + (remainder * remainder * remainder);
        }
            if (sum == temp) {
                System.out.println(" is an Armstrong number.");
            } else {
                System.out.println(" is not an Armstrong number.");
            }
        }
    }



