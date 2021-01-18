package com.movierecommendation.controller;


import com.movierecommendation.data.Movie;
import com.movierecommendation.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieEndPoint {


    @Autowired
    MovieService movieService;

    @PreAuthorize("hasRole('USER')")
    @PostMapping(value = "/movie/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String addMovie(@RequestBody(required = true) Movie entity) {
        movieService.addMovie(entity);
        return "Movie added successfully";
    }

    @GetMapping(value = "/auth/movie/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> list() {
        return movieService.list();
    }

}
