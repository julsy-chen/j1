import java.util.Scanner;
import java.util.ArrayList;

/*
 * First, take in input of an integer that determines the number of inputs
 * Then, takes in that number of inputs as a code with an integer, followed by a space, and then followed by a symbol
 * Outputs the symbol a number of times which is set by the integer preceding the symbol
 */

 public class j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        ArrayList<Integer> symbolCount = new ArrayList<Integer>(); // arraylist with the integers
        ArrayList<String> code = new ArrayList<String>(); // arraylist with the symbols
        String print = "";
        String symbol = "";
        int symbolNum = 0;
        String valueNum = "";

        // user inputs
        int line = Integer.parseInt(sc.nextLine()); // number of inputs

        for (int i = 0; i < line; i++) {
            String input = sc.nextLine();
            char[] inputArray = input.toCharArray();

            // finding out if the number is double or single digit for the number of symbols
            for (char c : inputArray) {
                if (c != ' ') {
                    valueNum += c; // adding the digits into a string until the space character
                } else {
                    symbolNum = Integer.parseInt(valueNum);
                    break;
                }
            }

            // determining where to get the symbol of this input
            if (symbolNum >= 10) {
                symbol = Character.toString(inputArray[3]); // if it's a double digit - get from index 3;
            } else {
                symbol = Character.toString(inputArray[2]); // if it's a single digit - get from index 2;
            }
            // adding characters into the arraylists
            symbolCount.add(symbolNum);
            code.add(symbol);
            valueNum = ""; // resetting valueNum
        }

        // output
        int i = 0;
        for (int j = 0; j < line; j++) { // going through each line of the code
            print = "";
            int count = symbolCount.get(i); // getting the symbol
            for (int k = 0; k < count; k++) { // repeating the symbol that number of times
                print = print + code.get(j);
            }
            i++;
            System.out.println(print);
        }

        sc.close();
    }
}
