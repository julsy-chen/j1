import java.util.Scanner;

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

                    if (output == "") {
                        output = value;
                    } else {
                        output = output + " " + value;
                    }
                    counter = 1;
                }
            }
            value = Integer.toString(counter) + " " + Character.toString(current);
            output = output == "" ? value : output + " " + value;

            // output
            System.out.println(output);
            output = "";
            counter = 0;
            current = ' ';
        }

        sc.close();
    }
}