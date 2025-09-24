package Spotify;

import java.util.Scanner;

public class ScannerHelper {

    private Scanner sc;

    //Constructor

    public ScannerHelper () {
        this.sc = new Scanner(System.in);
    }

    public void welcomeMessage() {
        System.out.println("Welcome!");
    }

    public int selectUser() {
        boolean numCorrect = false;
        int selectInt = 0;
        int selectIntMax = 2;

        while (!numCorrect) {

            if (sc.hasNextInt()) {
                selectInt = sc.nextInt();
                sc.nextLine();

                if (selectInt < 0) {
                    System.out.println("You have entered a negative number. Try again");
                } else if (selectInt == 0) {
                    System.out.println("You cannot enter 0. Try again");
                } else if (selectInt > selectIntMax) {
                    System.out.println("You cannot enter numbers larger than " + selectIntMax + ". Try again");
                } else {
                    numCorrect = true;
                }
            }
        }
        return selectInt;
    }

    public int selectOption() {
        boolean numCorrect = false;
        int selectInt = 0;
        int selectIntMax = 6;

        while (!numCorrect) {

            if sc.hasNextInt() {
                selectInt = sc.nextInt();
                sc.nextLine();

                if (selectInt < 0) {
                    System.out.println("You have entered a negative number. Try again");
                } else if (selectInt == 0) {
                    System.out.println("You cannot enter 0. Try again");
                } else if (selectInt > selectIntMax) {
                    System.out.println("You cannot enter numbers larger than " + selectIntMax + ". Try again");
                } else {
                    numCorrect = true;
                }
            }
        }
        return selectInt;
    }

 //   public

}
