package ContainMethods;
/*
18. Sum Calculator
Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
names firstNumber and secondNumber both of type double.
Write the following methods (instance methods):
● Method named getFirstNumber without any parameters, it needs to return the value of the
firstNumber field.
● Method named getSecondNumber without any parameters, it needs to return the value of
the secondNumber field.
● Method named setFirstNumber with one parameter of type double, it needs to set the value
of the firstNumber field.
● *Method named setSecondNumber with one parameter of type double, it needs to set the
value of the secondNumber field.
● Method named getAdditionResult without any parameters, it needs to return the result of
adding the field values of firstNumber and secondNumber.
● Method named getSubtractionResult without any parameters, it needs to return the result of
subtracting the field values of secondNumber from the firstNumber.
● Method named getMultiplicationResult without any parameters, it needs to return the result
of multiplying the field values of firstNumber and secondNumber.
● Method named getDivisionResult without any parameters, it needs to return the result of
dividing the field values of firstNumber by the secondNumber. In case the value of
secondNumber is 0 then return 0.
 */
import java.lang.System;
public class SimpleCalculator {
double firstNumber;
double secondNumber;

public void getFirstNumber(double firstNumber){
   this. firstNumber =firstNumber;
}
public void getSecondNumber(double secondNumber){
    this.secondNumber=secondNumber;
}
public void setFirstNumber(double a){
     this.firstNumber=a;
   // System.out.println(a);
}
public void setSecondNumber(double b){
  this.secondNumber=b;
    //System.out.println(b);
}
public void getAddition(){
   double ans=firstNumber+secondNumber;
    System.out.println(ans);

}
    public void getSubtraction(){
      double  ans =firstNumber-secondNumber;
      System.out.println(ans);

    }
    public void getMultiplication(){
     double   ans = firstNumber * secondNumber;
     System.out.println(ans);

    }
    public void getDivision(){
        double ans = firstNumber / secondNumber;
       System.out.println(ans);

    }

}

