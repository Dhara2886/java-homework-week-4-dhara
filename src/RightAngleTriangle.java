/*
Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */
public class RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int a = 1; a<= rows; a++){
            //Print @ i times for each row
            for (int b = 1; b<= a; b++){
                System.out.print("@");
            }
            //move to the next line after printing each row.
            System.out.println();
        }

    }
}
