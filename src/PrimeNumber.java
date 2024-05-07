import java.util.Scanner;

//Write a programme to input any number and check if it is prime or not.
public class PrimeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        // Function to check if a number is prime
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }

            // Check divisibility from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // If divisible by any number, it's not prime
                }
            }

            return true; // If not divisible by any number, it's prime

    }

}
