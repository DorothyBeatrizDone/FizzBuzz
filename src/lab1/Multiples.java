package lab1;

/*

We're looking for integers greater than 0 that are multiples of 3 or 5. The first four are 3, 5, 6, and 9, so there are four below 10. How many are below 1000?

In Multiples.java, write a main method that prints how many multiples of 3 or 5 there are below 1000. Add this file to your project, commit, and push. Check your repo on GitHub to confirm your changes were pushed successfully.
Tip: Just like with psvm, you can start typing sout and then press Enter to generate System.out.println(); in IntelliJ.
 */

/**
 * Count the positive integers below 1000 that are multiples of 3 or 5.
 */
public class Multiples {

    public static void main(String[] args) {

        // Test every positive integer from 1 through 999.
        int count = count(1000,3,5);

        // Print the final count after the loop finishes.
        System.out.println(count);
    }

    public static int count(int a, int b, int c) {
        //removed public keyword to be able to test count.
        int numMultiplesCount = 0;
        int number = 1;
        while (number < a) {
            // The number of multiples found so far.

            boolean divisibleBy3 = number % b == 0;
            boolean divisibleBy5 = number % c == 0;

            // Count the number once if it is divisible by 3 OR 5.
            if (divisibleBy3 || divisibleBy5) {
                numMultiplesCount++;
            }

            // Move to the next integer.
            number++;
        }
        return numMultiplesCount;
    }
}
