//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class FibonacciSequence {
    public static void main(String[] args) {
        //Number of numbers in the sequence
        int a = 8;
        //Display the Fibonacci sequence
        for (int b = 0; b <= a; b++){
            System.out.println(fibonacci(b) + " ");
        }
    }
    //Method to calculate the Fibonacci number at position 'a'
    public static int fibonacci(int a) {
        if (a <= 1) {
            return a;
        }else {
            return fibonacci(a-1) + fibonacci(a - 2);
        }
    }
}
