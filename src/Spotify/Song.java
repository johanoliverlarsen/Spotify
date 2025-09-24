package Spotify;

public class Song {
    private String title;
    private Genre genre;


    //Konstruktør
    public song(String title, Genre genre){
        this.title;
        this.genre;
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
        return title + genre;
    }
}
