package lv.javaguru.calculator;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator newCalculator = new Calculator ();

        int sumResult = newCalculator.sum (10 , 15);
        int substractResult = newCalculator.substract (3 , 10);
        int multiplyResult = newCalculator.multiply (20 , 20);
        double divisionResult = newCalculator.divide (5 , 2);

        System.out.println ("Sum of two digits is " + sumResult);
        System.out.println ("Substraction of two digits is " + substractResult);
        System.out.println ("Multiplication of two digits is " + multiplyResult);
        System.out.println ("Division of two digits is " + divisionResult);

    }
}
