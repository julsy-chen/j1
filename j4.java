import java.util.Scanner;

/*
 * Imagine a 2 by 2 grid composed of 4 numbers - from left to right, it goes 1, 2, 3, 4
 * Takes in input as one line composed of a sequence of either H, representing a horizontal flip, or V, representing a vertical flip
 * Outputs the final orientation of the four numbers
 */

public class j4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int topLeft = 1; // orientation of the original grid of four numbers
        int topRight = 2;
        int botLeft = 3;
        int botRight = 4;
        int temp = 1;

        int hCounter = 0;
        int vCounter = 0;

        // input
        String input = sc.nextLine();
        char[] flips = input.toCharArray();

        // quick
        for (char letter : flips) { // counts the number of letters in each one to find the most minimum number of 'H' and 'V'
            switch (letter) {
                case 'H':
                    hCounter++;
                    break;

                case 'V':
                    vCounter++;
                    break;
            }
        } 

        input = ""; // resetting input
        hCounter = hCounter % 2; // cancels out unnecessary letters
        vCounter = vCounter % 2;

        // puts letters into input to be coverted to a char array
        for (int i = 0; i < vCounter; i++) {
            input += "V";
        }

        for (int i = 0; i < hCounter; i++) {
            input += "H";
        }
        flips = input.toCharArray(); // convert to char array to iterate through
        
        // processing
        for (char letter : flips) { // "flipping" the numbers to get to the correct orientation
            switch (letter) {
                case 'H':
                    temp = topLeft;
                    topLeft = botLeft;
                    botLeft = temp;
                    temp = topRight;
                    topRight = botRight;
                    botRight = temp;
                    break;
                case 'V':
                    temp = topLeft;
                    topLeft = topRight;
                    topRight = temp;
                    temp = botLeft;
                    botLeft = botRight;
                    botRight = temp;
                    break;
            }
        }

        // output
        String lineOne = topLeft + " " + topRight;
        String lineTwo = botLeft + " " + botRight;
        System.out.println(lineOne);
        System.out.println(lineTwo);

        sc.close();
    }
}
