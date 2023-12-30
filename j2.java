import java.util.Scanner;
import java.util.ArrayList;

public class j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        ArrayList<Integer> symbolCount = new ArrayList<Integer>();
        ArrayList<String> code = new ArrayList<String>();
        String print = "";
        String symbol = "";
        int symbolNum = 0;
        String tempNum = "";
        int realNum = 0;

        // user inputs
        int line = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < line; i++) {
            String input = sc.nextLine();
            char[] inputArray = input.toCharArray();

            // finding out if the number is double or single digit for the number of symbols
            if (inputArray[1] == '0' || inputArray[1] == '1' || inputArray[1] == '2' || inputArray[1] == '3' || inputArray[1] == '4' || inputArray[1] == '5' || inputArray[1] == '6' || inputArray[1] == '7' || inputArray[1] == '8' || inputArray[1] == '9') {
                symbol = Character.toString(inputArray[3]);
                tempNum = Character.toString(inputArray[0]);
                realNum = Integer.parseInt(tempNum);
                symbolNum = realNum*10 + Integer.parseInt(Character.toString(inputArray[1]));
            }
            else {
                symbol = Character.toString(inputArray[2]);
                symbolNum = Integer.parseInt(Character.toString(inputArray[0]));
            }

            // adding characters into the string
            symbolCount.add(symbolNum);
            code.add(symbol);

        }
        
        //output
        int i = 0; 
        for (int j = 0; j < line; j++) { // going through each line of the code 
            print = "";
            int count = symbolCount.get(i);
            for (int k = 0; k < count; k++) { // repeating the symbol that number of times
                print = print + code.get(j);
            }
            i++;
            System.out.println(print);
        }

        sc.close();
    }
}
