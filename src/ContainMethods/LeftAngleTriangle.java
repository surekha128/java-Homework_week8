package ContainMethods;

import java.util.Scanner;

/*
15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class LeftAngleTriangle {
    public static void main(String[] args) {


        int e;
        int f;

        Scanner scan = new Scanner(System.in);
     //   e = scan.nextInt();
        for (e = 1; e <=5; e++) {
            for (f = 1; f <=e; f++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}