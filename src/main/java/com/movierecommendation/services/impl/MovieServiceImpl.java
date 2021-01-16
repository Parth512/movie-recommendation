package com.movierecommendation.services.impl;

import com.movierecommendation.dao.MovieDao;
import com.movierecommendation.data.Movie;
import com.movierecommendation.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieDao movieDao;

    @Override
    public void addMovie(Movie movie) {
        movieDao.addMovie(movie);
    }

    @Override
    public List<Movie> list() {
        return movieDao.list();
    }
}
