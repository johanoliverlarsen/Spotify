package Spotify;

import java.util.ArrayList;

public class Song {
    private String title;
    private Genre genre;


    //Konstruktør
    public Song(String title, Genre genre){
        this.title = title;
        this.genre = genre;
    }
    //Getters

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    @Override
    public String toString(){
        return "Title: " + title + ", Genre: " + genre;
    }
    /*ArrayList<Song>songs =  new ArrayList<>();
    songs.add(new Song("Darude Sandstorm", Genre.POP));
    songs.add(new Song("UNZ", Genre.DAK));
    songs.add(new Song("Autumn Leaves", Genre.JAZZ));
    songs.add(new Song("Shape Of You", Genre.ROCK));
    songs.add(new Song("Søren Banjomus", Genre.GRIME));
    songs.add(new Song("BEN", Genre.RAP));
    songs.add(new Song("Gettin Jiggy Wit It", Genre.HIPHOP));*/


}
