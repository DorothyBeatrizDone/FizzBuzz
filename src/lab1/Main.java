package lab1;

public class Main {
    static void main(String[] args) {
        FizzBuzz.main(new String[]{"5"});
        //To generate "main", start typing the "psvm" in IntelliJ
        //Begin the entire FizzBuzz program at 5 and keep looping.
        //FizzBuzz.doFizzBuzz(5) //generates error, click the one that makes it public. It is private intially so it must be made
        // meaning it can only be called inside the FizzBuzz class.
        //Why does FizzBuzz.main() not work?
        //FizzBuzz.main() does not work with empty parentheses because its declaration requires one argument.
        // Use FizzBuzz.main(new String[]{"5"});
        // Add this to the main file int i = Integer.parseInt(args[0]);
        //args[0] retrieves the first string, "5".
        //Integer.parseInt(...) converts "5" into the integer 5.

    }
}
