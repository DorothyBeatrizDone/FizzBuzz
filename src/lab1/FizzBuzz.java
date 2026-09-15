package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
//Task 1.1
/*
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;

        while (i < 100) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
            i++;
        }
    }
}
 */
//Task 2
class FizzBuzz {

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]); //remove this for first demonstration, this is part of Task 3.2
        //int i = 1;

        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}

//Task 2.1: publishing changes
//git add src/lab1/FizzBuzz.java
//git commit -m "refactored to extract the helper function for second demo of lab 1"
//git push -> go to the main at the top left section and click either the "push" or "commit"



