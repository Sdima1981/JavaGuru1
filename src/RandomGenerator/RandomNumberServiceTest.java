package RandomGenerator;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberServiceTest {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input bound for the First random number ");
            int firstBound = reader.nextInt();
        System.out.println("Input bound for the Second random number ");
            int secondBound = reader.nextInt();
        System.out.println("Input bound for the Third random number ");
            int thirdBound = reader.nextInt();
            reader.close();

         Random randomGenerator = new Random();
            int firstRandomNumber = randomGenerator.nextInt(firstBound);
            int secondRandomNumber = randomGenerator.nextInt(secondBound);
            int thirdRandomNumber = randomGenerator.nextInt(thirdBound);
            int sum = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        System.out.println("First random number is " + firstRandomNumber);
        System.out.println("Second random number is " + secondRandomNumber);
        System.out.println("Third random number is " + thirdRandomNumber);
        System.out.println("Sum of these three numbers is " + sum);

    }

}
