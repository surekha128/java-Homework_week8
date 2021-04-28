package ContainMethods;

public class SimpleCalcalling {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        calculator.getAddition();
        calculator.getSubtraction();
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        calculator.getMultiplication();
        calculator.getDivision();
    }

}
