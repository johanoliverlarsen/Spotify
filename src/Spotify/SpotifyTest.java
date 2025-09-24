package Spotify;

import java.util.ArrayList;

public class SpotifyTest{

    private static ScannerHelper Sc = new ScannerHelper();
    private static ArrayList<Song> playlist = new ArrayList<>();

    public static void main(String[] args) {

     runSpotify();


    }

    public static void runSpotify() {

 //       ScannerHelper Sc = new ScannerHelper();
        Sc.welcomeMessage();

        Sc.selectUser();

        addDefaultPlaylist();




        boolean running = true;
//        chooseUserOption();


        while (1 != 0) {
            int choice = Sc.selectOption();
            switch (choice) {
                case 1 -> addSong();
                case 2 -> removeSong();
                case 3 -> showAllSongs();
                //             case 4 -> editSongTitle();
                //             case 5 -> running = false;
                //             default -> System.out.println("Invalid choice, try agian");
            }
        }

    }

    public static void addSong() {
        //something
        ScannerHelper Sc = new ScannerHelper();
        System.out.println("TEST");
        String songTitle = Sc.askSongTitle();
        Genre songGenre = Sc.askSongGenre();
        playlist.add(new Song(songTitle, songGenre));

    }

    public static void removeSong() {
        //something
    }

    public static void showAllSongs() {
        for (Song s : playlist) {
            System.out.println(s);
        }
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














