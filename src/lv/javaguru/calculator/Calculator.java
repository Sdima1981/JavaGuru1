package lv.javaguru.calculator;

public class Calculator {
    int firstNumber;
    int secondNumber;
    int result;

    int sum (int firstNumber , int secondNumber){
        int result = firstNumber + secondNumber;
        return result;
    }

    int substract (int firstNumber , int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    int multiply (int firstNumber , int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    double divide (int firstNumber , int secondNumber) {
        double result = (double) firstNumber / secondNumber;
        return result;
    }
}
