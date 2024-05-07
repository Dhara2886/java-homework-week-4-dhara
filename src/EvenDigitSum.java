/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */
public class EvenDigitSum {
        public static void main(String[] args) {
            // Test cases
            System.out.println(getEvenDigitSum(123456789)); // Should return 20
            System.out.println(getEvenDigitSum(252));      // Should return 4
            System.out.println(getEvenDigitSum(-22));      // Should return -1
        }

        public static int getEvenDigitSum(int number) {
            if (number < 0) {
                return -1; // Return -1 for negative numbers
            }

            int sum = 0;

            while (number > 0) {
                int digit = number % 10; // Extract the rightmost digit
                if (digit % 2 == 0) {   // Check if the digit is even
                    sum += digit;        // Add the even digit to the sum
                }
                number /= 10;            // Remove the rightmost digit
            }

            return sum;
        }

}
