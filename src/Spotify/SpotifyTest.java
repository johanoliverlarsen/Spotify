package Spotify;

import java.util.ArrayList;

public class SpotifyTest{

    private static ScannerHelper Sc = new ScannerHelper();
    private static ArrayList<Song> playlist = new ArrayList<>();
    private static boolean running = true;

    public static void main(String[] args) {

     runSpotify();


    }

    public static void runSpotify() {

        Sc.welcomeMessage();

        Sc.selectUser();

        addDefaultPlaylist();






        while (running) {
            int choice = Sc.selectOption();
            switch (choice) {
                case 1 -> addSong();
                case 2 -> removeSong();
                case 3 -> showAllSongs();
                //case 4 -> searchSong();
                case 5 -> editSong();
                case 6 -> endProgram();
            }
        }

    }

    public static void addSong() {
        //something
    //    ScannerHelper Sc = new ScannerHelper();
        System.out.println("TEST");
        String songTitle = Sc.askSongTitle();
        Genre songGenre = Sc.askSongGenre();
        playlist.add(new Song(songTitle, songGenre));

    }

    public static void removeSong() {
        int playlistSize = playlist.size();
        int playlistIntMax = playlistSize + 1;
        int listInt = 1;
        int answer = 0;

        System.out.println();
        for (Song s : playlist) {
            System.out.println(listInt + ". " + s);
            listInt++;
        }


            System.out.println("Which song do you want to remove?");
            System.out.print("Select song 1 to " + playlistIntMax + ": ");
            answer = Sc.playlistIntValidation(playlistSize);
    //      System.out.println("The user typed " + answer);
            int playlistIndex = answer - 1;
            String songToRemove = playlist.get(playlistIndex).toString();
            playlist.remove((playlistIndex));
            System.out.println("Succesfully removed " + songToRemove);

    }

    public static void showAllSongs() {
        int listInt = 1;
        System.out.println();
        for (Song s : playlist) {

            System.out.println(listInt + ": " + s);
            listInt++;
        }
    }

    public static void editSong() {
        int playlistSize = playlist.size();
        int playlistIntMax = playlistSize + 1;
        int listInt = 1;
        int answer = 0;

        System.out.println();
        for (Song s : playlist) {
            System.out.println(listInt + ". " + s);
            listInt++;
        }

        System.out.println("Which song do you want to edit?");
        System.out.print("Select song 1 to " + playlistIntMax + ": ");
        answer = Sc.playlistIntValidation(playlistSize);
  //      System.out.println("The user typed " + answer);
        int playlistIndex = answer - 1;

        String songTitle = Sc.askSongTitle();
        Genre songGenre = Sc.askSongGenre();

        playlist.get(playlistIndex).setTitle(songTitle);
        playlist.get(playlistIndex).setGenre(songGenre);

    }

    public static void searchSong() {

        System.out.println("Please enter song to seach for below.");
        //først brug askSongTitle til input af titel
        String answer = Sc.askSongTitle();

        for (Song s : playlist) {
            //if (// songTitle.contains(userInput))
                // True, break, Ja den er der
            //get songTitle
            // user intput
            // songTitle.contains(userInput)
            //brug string .contains() metode og lav getter, så du sammen ligner navnet
        }



        //https://www.w3schools.com/java/ref_string_contains.asp

    }


    public static void endProgram() {
        running = false;
        System.out.println("The program have been TERMINATED");

    }

    public static void addDefaultPlaylist() {
    playlist.add(new Song("Darude Sandstorm", Genre.POP));
    playlist.add(new Song("UNZ", Genre.DAK));
    playlist.add(new Song("Autumn Leaves", Genre.JAZZ));
    playlist.add(new Song("Shape Of You", Genre.ROCK));
    playlist.add(new Song("Søren Banjomus", Genre.GRIME));
    playlist.add(new Song("BEN", Genre.RAP));
    playlist.add(new Song("Gettin Jiggy Wit It", Genre.HIPHOP));
    }


}














