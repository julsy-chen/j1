import java.util.Scanner;

public class j4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int topLeft = 1;
        int topRight = 2;
        int botLeft = 3;
        int botRight = 4;
        int temp = 1;

        // input
        String input = sc.nextLine();
        char[] flips = input.toCharArray();

        // processing
        for (char letter : flips) {
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
