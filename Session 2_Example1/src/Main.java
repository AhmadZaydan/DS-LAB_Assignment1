//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Function to find maximum number
    public static int findMax(int[] Array) {
        if (Array == null || Array.length == 0) {
            throw new IllegalArgumentException("Input array must not be empty or null");
        }

        int max = Array[0];

        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }

        return  max;
    }

    // Function to find fibonacci number
    public static int findFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;

            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }

            return b;
        }
    }

    // Function to check whether there's a 0 and -1 in the array
    public static boolean containsZeroOrMinusOne(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }

        for (int value : array) {
            if (value <= 0) {
                return true; // Array contains 0 or -1
            }
        }

        return false; // Array does not contain 0 or -1
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers;

        do {
            // Prompt the user for input
            System.out.print("Enter integers separated by commas: ");

            // Read the entire line of input from the user
            String userInput = scanner.nextLine();

            // Split the input string into an array of strings
            String[] inputArray = userInput.split(",");

            // Convert the array of strings to an array of integers
            numbers = Arrays.stream(inputArray)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // Display the contents of the array
            System.out.println("Array: " + Arrays.toString(numbers));

            if (containsZeroOrMinusOne(numbers)) {
                System.out.println("Array must not contain 0 or negative. Please re-enter.");
            }

        } while (containsZeroOrMinusOne(numbers));

        System.out.println(" ");

        // Check whether there's a 0 and -1
        System.out.println("Array 1 contains 0 or -1: " + containsZeroOrMinusOne(numbers));

        System.out.println(" ");

        // initialize the maximum number
        int max = findMax(numbers);
        System.out.println("Maximum value in the array is " + max);

        System.out.println(" ");

        // Find the fibonacci number
        int fibonacciN = findFibonacci(max);
        System.out.println("Fibonacci number at position " + max + ": " + fibonacciN);

        System.out.println(" ");

        System.out.println("""
                Time complexity of this code:\s
                findMax function: O(n)
                findFibonacci method: O(n)
                findMax method: O(n)
                findMax method: O(m)
                Overall time complexity: O(n+m)""");

        System.out.println(" ");

        System.out.println("""
                Space complexity of this code:\s
                findMax function: O(1)
                findFibonacci method: O(1)
                findMax method: O(1)
                findMax method: O(m+n)
                Overall space complexity: O(m+n)""");

    }
}