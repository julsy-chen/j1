import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // variables
        int appleScore = 0;
        int bananScore = 0;
        int tempNum = 0;

        // User Inputs
        tempNum = Integer.parseInt(sc.nextLine());
        appleScore = appleScore + 3*tempNum;

        tempNum = Integer.parseInt(sc.nextLine());
        appleScore = appleScore + 2*tempNum;

        tempNum = Integer.parseInt(sc.nextLine());
        appleScore = appleScore + tempNum;

        tempNum = Integer.parseInt(sc.nextLine());
        bananScore = bananScore + 3*tempNum;
        
        tempNum = Integer.parseInt(sc.nextLine());
        bananScore = bananScore + 2*tempNum;

        tempNum = Integer.parseInt(sc.nextLine());
        bananScore = bananScore + tempNum;

        // output
        if (appleScore > bananScore) {
            System.out.println("A");
        }
        else if (bananScore > appleScore) {
            System.out.println("B");
        }
        else {
            System.out.println("T");
        }

        sc.close();
    } 
}