package com.movierecommendation.dao;

import com.movierecommendation.data.Movie;

import java.util.List;

public interface MovieDao {

    /**
     * to add movie in db
     * @param movie
     */
    public void addMovie(Movie movie);

    /**
     * returns list of movis
     * @return
     */
    public List<Movie> list();

}
