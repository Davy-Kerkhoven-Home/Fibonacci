import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        out.println("In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.");
        out.println("Which numbered position of the Fibonacci sequence would you like to display? (Enter X to exit)");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";

        boolean exitCharGiven = false;
        while (!exitCharGiven) {
            try {
                userInput = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (userInput.equals("X")) {
                exitCharGiven = true;
            } else {
                int number;
                try {
                    number = Integer.parseInt(userInput);
                    out.println("That would be: " + getFib(number));
                    out.println("Which position would you like to try next? (Enter X to exit)");
                } catch (NumberFormatException e) {
                    out.println("Please enter a number.");
                }
            }
        }
        out.println("Goodbye!");
    }

    public static int getFib(int n) {
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        return getFib(n-1)+getFib(n-2);
    }
}