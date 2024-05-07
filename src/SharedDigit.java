/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class SharedDigit {
        public static void main(String[] args) {
            // Test cases
            System.out.println(hasSharedDigit(12, 23)); // Should return true
            System.out.println(hasSharedDigit(9, 99));  // Should return false
            System.out.println(hasSharedDigit(15, 55)); // Should return true
        }

        public static boolean hasSharedDigit(int num1, int num2) {
            if (!isValid(num1) || !isValid(num2)) {
                return false;
            }

            // Extract digits from num1 and num2
            int digit1 = num1 % 10;
            int digit2 = num1 / 10;
            int digit3 = num2 % 10;
            int digit4 = num2 / 10;

            // Check if any of the digits in num1 are equal to any of the digits in num2
            return digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4;
        }

        // Method to check if a number is within the range of 10 (inclusive) - 99 (inclusive)
        public static boolean isValid(int num) {
            return num >= 10 && num <= 99;
        }


}
