package ContainMethods;
/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative NOTE:
The method getEvenDigitSum should be defined as public static
 */



public class EvenDigitSum {
    static void SumEven(int number) {
       /* int lastdigit;
        int evendigit = 0;

        while (number != 0) {
            lastdigit = number % 10;
evendigit=lastdigit;
            if (lastdigit % 2 == 0) {
                number = evendigit + lastdigit;
                number = evendigit/10;
                number=evendigit+number;
            } else {


            }
        }
         System.out.println("sum of even digit"+number);
    }*/
       // int a[i] ;
        int i=0,j=0, EvenSum = 0,Size=10;
      /*  while (j <= 10) {
            if (a[j] % 2 == 0) {
                EvenSum = EvenSum + a[j];
            }
            j++;
        }
        System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);*/
        int[] a = new int[0];
        while(i < Size)
        {
            i++;
        }

        while(j < Size)
        {
            if(a[j] % 2 == 0)
            {
                EvenSum = EvenSum + a[j];
            }
            j++;
        }
        System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
    }
    
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        EvenDigitSum obj = new EvenDigitSum();
     //   obj.SumEven(123456789);
        obj.SumEven(232);
    }
}