package com.example.MovieTicket.MovieBooking.Model;

import java.util.List;

public class Movie {
    private String id;

    private String movieName;
    private String movieDirector;

    private long movieRating;

    private String movieLanguage;

    private List<String> writers;

    private List<String> actors;

    private List<String> genre;

    public Movie(String id, String movieName, String movieDirector,
                 long movieRating, String
                         movieLanguage, List<String> writers, List<String>
                         actors, List<String> genre) {
        this.id = id;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
        this.movieLanguage = movieLanguage;
        this.writers = writers;
        this.actors = actors;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public long getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(long movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

}
