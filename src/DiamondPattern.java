/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *   *******
 *    *****
 *     ***
 *      *
 */
public class DiamondPattern {
    public static void main(String[] args) {
        int n = 6; // Number of rows (half of the diamond)

        // Upper half of the diamond
        int i = 1;
        while (i <= n) {
            int spaces = n - i;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            int stars = 2 * i - 1;
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }

            System.out.println();
            i++;
        }

        // Lower half of the diamond
        i = n - 1;
        while (i >= 1) {
            int spaces = n - i;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            int stars = 2 * i - 1;
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }

            System.out.println();
            i--;
        }
    }


}
