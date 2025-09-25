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
/*
        System.out.println("\nChoose option:");
        System.out.println("1: Add song");
        System.out.println("2: Remove song");
        System.out.println("3: Show all songs");
        System.out.println("4: Search for song");
        System.out.println("5: Edit song title");
        System.out.println("6: Finish");
        System.out.print("Choose option (1-6): ");
*/
    }

    public int selectUser() {
        boolean numCorrect = false;
        int selectInt = 0;
        int selectIntMax = 2;

        while (!numCorrect) {
            System.out.print("Please create user.\n1: Free User\n2: Premium.\n Input your choice: ");

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
                    if (selectInt == 1) {
                        System.out.println("You are a free user.");
                    } else {
                        System.out.println("you are a premium user.");
                    }
                    numCorrect = true;
                }
            } else {
                System.out.println("That's not a number. Try again");
                sc.nextLine(); // rydder forkert input
            }
        }
        return selectInt;
    }

    public int selectOption() {
        boolean numCorrect = false;
        int selectInt = 0;
        int selectIntMax = 6;

        System.out.println("\nChoose option:");
        System.out.println("1: Add song");
        System.out.println("2: Remove song");
        System.out.println("3: Show all songs");
        System.out.println("4: Search for song");
        System.out.println("5: Edit song title");
        System.out.println("6: Finish");
        System.out.print("Choose option (1-6): ");

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
            } else {
                System.out.println("That's not a number. Try again");
                sc.nextLine(); // rydder forkert input
            }
        }
        return selectInt;
    }

    public int playlistIntValidation(int intMax) {
        boolean numCorrect = false;
        int selectInt = 0;
        int selectIntMax = intMax;


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
            } else {
                System.out.println("That's not a number. Try again");
                sc.nextLine(); // rydder forkert input
            }
        }
        return selectInt;
    }


    public String askSongTitle() {
        System.out.print("What is the name of the song?: ");
        String answer = sc.nextLine();
        return answer;
    }

    public Genre askSongGenre() {
        String answer = "";
        boolean answerCorrect = false;
        System.out.print("Choose between these genres: ");
        for (Genre g : Genre.values()) {
            System.out.print(g + ", ");

        }

        while (!answerCorrect) {

            System.out.print("What is the genre of the song?: ");
            answer = sc.nextLine();
            answer = answer.toUpperCase();

            for (Genre g : Genre.values()) {
                System.out.println("answer: "+ answer);
                System.out.println("genre: " + g);
                System.out.println("answerCorrect" + answerCorrect);
                if (answer.equals(g.name())) {
                    answerCorrect = true;
                    System.out.println("it's true");
                  //  return answer;
                    break;
                }


            } if (!answerCorrect) {
                System.out.println("That's not a genre");
            }
        }

        return Genre.valueOf(answer);



    }

 //   public

}
