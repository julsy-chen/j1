import java.util.Scanner;

/*
 * First, takes in input of an integer that determines the number of lines of input
 * Then, takes in that number of inputs as lines as a code with multiple symbols
 * Ouputs the number of consecutive symbols then the symbol, and repeats for the entire line of code
 */

public class j3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        char current = ' ';
        int counter = 0;
        String value = "";
        String output = "";

        // input
        // gathering number of inputs for number of strings in the array
        int n = Integer.parseInt(sc.nextLine());

        String[] inputs = new String[n]; // array for the inputs
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextLine();
        }

        for (String line : inputs) { // to iterate through the array of inputs - gets a string
            char[] charArray = line.toCharArray(); // converts string into a character array

            for (char symbol : charArray) { // iterate through each symbol of the character array
                if (current == ' ') { // for the first symbol - when current is set to a space
                    current = symbol;
                    counter++;
                } else if (current == symbol) { // for when the symbol stays the same
                    counter++;
                } else { // for when the symbol changes its character
                    value = Integer.toString(counter) + " " + Character.toString(current);
                    current = symbol;

                    output = output == "" ? value : output + " " + value; // if output is empty, output will b set to
                                                                          // value, otherwise, output adds value to
                                                                          // itself with a space in between
                    counter = 1; // updating counter - first instance for a new character
                }
            }
            value = Integer.toString(counter) + " " + Character.toString(current); // for when the symbol never changes
                                                                                   // on a line
            output = output == "" ? value : output + " " + value; // if output is empty, output will be set to value,
                                                                  // otherwise, output adds value to itself with a space
                                                                  // in between

            // output
            System.out.println(output);
            output = "";
            counter = 0;
            current = ' ';
        }

        sc.close();
    }
}