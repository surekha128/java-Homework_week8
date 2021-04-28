package ContainMethods;
//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class FibonacciNumber {

    public static void main(String[] args) {


        int maxNumber = 10, previousNumber = 0, nextNumber = 1;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        int i = 1;
        while (i <= maxNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
}
 /*int maxNumber = 0;
		 int previousNumber = 0;
		 int nextNumber = 1;

		    System.out.println("How many numbers you want in Fibonacci:");
	        Scanner scanner = new Scanner(System.in);
	        maxNumber = scanner.nextInt();
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");*/
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number

    int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
                        nextNumber = sum;
*/
