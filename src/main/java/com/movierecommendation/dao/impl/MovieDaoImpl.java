package com.movierecommendation.dao.impl;

import com.movierecommendation.dao.MovieDao;
import com.movierecommendation.data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void addMovie(Movie movie) {
        mongoTemplate.insert(movie);
    }

    @Override
    public List<Movie> list() {
        return mongoTemplate.findAll(Movie.class);
    }
}
