package com.movierecommendation.services;

import com.movierecommendation.data.Movie;

import java.util.List;

public interface MovieService {

    /**
     * To add movie
     * @param movie
     */
    public void addMovie(Movie movie);

    public List<Movie> list();
}
