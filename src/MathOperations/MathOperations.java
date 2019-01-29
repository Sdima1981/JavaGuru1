/*
* Course: 2019_Winter_Sunday
* Student: Dmitrijs Surigins
* Assignment: Lesson 2, Level 1: Арифметические Операции
* */

package MathOperations;

import com.sun.xml.internal.ws.wsdl.writer.document.Import;

import java.util.Scanner;

public class MathOperations {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int firstNumber = reader.nextInt();

        System.out.println("Введите второе число ");
        int secondNumber = reader.nextInt();
        reader.close();
        //System.out.println(n);

        String greeting = "Hello Everybody!!!";
        String answer = "How you doin...";
        //Integer firstNumber = 10;
        //Integer secondNumber = 20;
        int subtract = (secondNumber - firstNumber);
        int division = secondNumber / firstNumber;
        int sum = (firstNumber + secondNumber);
        int multiply = (firstNumber * secondNumber);
        System.out.println("First number is " + firstNumber + ";"); System.out.println("Second number is " + secondNumber + ";");
        System.out.println("This is the result of First number summed with Second number = " + sum + ";");
        System.out.println("This is the result of First number subtracted out of Second number = " + subtract + ";");
        System.out.println("This is the result of Second number divided by First number = " + division + ";");
        System.out.println("This is the result of First number multiplied by Second number = " + multiply + ";");


    }
}
