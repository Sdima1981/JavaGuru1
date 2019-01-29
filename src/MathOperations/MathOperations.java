/*
* Course: 2019_Winter_Sunday
* Student: Dmitrijs Surigins
* Assignment: Lesson 2, Level 1: Арифметические Операции
* */

package MathOperations;

public class MathOperations {
    public static void main (String[] args) {

        String greeting = "Hello Everybody!!!";
        String answer = "How you doin...";
        Integer firstNumber = 10;
        Integer secondNumber = 20;
        int subtract = (secondNumber - firstNumber);
        int division = secondNumber / firstNumber;
        int sum = (firstNumber + secondNumber);
        int multiply = (firstNumber * secondNumber);
        System.out.println("First number is 10;"); System.out.println("Second number is 20;");
        System.out.println("This is the result of First number summed with Second number = " + sum + ";");
        System.out.println("This is the result of First number subtracted out of Second number = " + subtract + ";");
        System.out.println("This is the result of Second number divided by First number = " + division + ";");
        System.out.println("This is the result of First number multiplied by Second number = " + multiply + ";");


    }
}
