package ContainMethods;

import java.util.Scanner;

/*
8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@

 */
public class TriangleOfAt {
    public static void main(String[] args) {
        int s;
        int d;

        Scanner scan = new Scanner(System.in);
        s=scan.nextInt();
        for(s=1;s<=5;s++){
        for (d=1;d<=s;d++)
            System.out.print("@");
            System.out.println("");
        }
    }

}
