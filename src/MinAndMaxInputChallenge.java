/**
 * Read the numbers from the console entered by the user
 * print the minimum and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number,
 * break out of the loop and print the minimum and maximum number.
 * Use an endless while loop.
 * Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
// use an endless while loop
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
                //break out the loop when invalid number entered
            } else {
                System.out.println("Invalid input. Exiting...");
                break;
            }
        }

        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
        } else {
            System.out.println("No valid numbers entered.");
        }

        scanner.close();
    }


}
