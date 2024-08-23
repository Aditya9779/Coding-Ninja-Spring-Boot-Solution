package com.example.MovieTicket.MovieBooking.service;

import com.example.MovieTicket.MovieBooking.Model.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieService implements MovieServiceInterface {

    List<Movie> movieList = new ArrayList<>();
    HashMap<String, Movie> movieMap = new HashMap<>();

    @Override
    public List<Movie> getAllMovies() {
        return this.movieList;
    }

    @Override
    public void addMovie(Movie movie) {
        movieList.add(movie);
        movieMap.put(movie.getId(), movie);
    }

    @Override
    public Movie getMovieById(String id) {
        Movie current = movieMap.get(id);
        return current;
    }

    @Override
    public void deleteMovieBtId(String id) {
        Movie currentMovie = getMovieById(id);
        movieList.remove(currentMovie);
        movieMap.remove(id);
    }

    @Override
    public void updateMovie(String id, Movie movie) {
        Movie currentMovie = getMovieById(id);
        movieList.remove(currentMovie);
        movieList.add(movie);
        movieMap.put(currentMovie.getId(), movie);
    }
}
