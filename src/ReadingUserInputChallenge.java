/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * If hasNextInt() returns false, print the message Invalid Number.
 * Continue reading until you have read 10 numbers.
 * Use the nextInt() method to get the number and add it to the sum.
 * Before the user enters each number, print the message Enter number #x:
 * where x represents the count, i.e. 1, 2, 3, 4, etc.
 * For example, the first message printed to the user would be, Enter number #1:,
 * the next Enter number#2:, and so on.
 * Use a while loop.
 * Use a counter variable for counting valid numbers.
 * Close the scanner after you don't need it anymore.
 * Create a class with the name ReadingUserInputChallenge.
 */
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        //use hasNextInt() method to check if the user has entered int value.
        while (count <= 10) {
            System.out.print("Enter number #" + count + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt(); //use nextInt() method to get the number.
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");//if not int value create invalid output
                scanner.next();
            }
        }
        // sum of all the 10 numbers entered.
        System.out.println("The sum of the numbers is: " + sum);
        scanner.close();
    }
}
