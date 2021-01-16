package com.movierecommendation.controller;

import com.movierecommendation.data.History;
import com.movierecommendation.data.Movie;
import com.movierecommendation.services.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/history")
public class HistoryEndPoint {

    @Autowired
    HistoryService historyService;


    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String addMovie(@RequestBody(required = true) History entity) {
        historyService.add(entity);
        return "history added successfully";
    }

    @GetMapping(value = "/getLast10", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getLast10Byuser(@RequestHeader String userId) {
        return historyService.getLast10ByUser(userId);
    }

    @GetMapping(value = "/recommendation", produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<String> getRecommendation(@RequestHeader String userId) {
        return historyService.recommendatedGerns(userId);
    }
}
