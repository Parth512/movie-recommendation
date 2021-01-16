package com.movierecommendation.data;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class History {
    private Movie movie;
    private long timestamp;
    private String username;

    public History() {
    }

    public History(Movie movie, long timestamp, String username) {
        this.movie = movie;
        this.timestamp = timestamp;
        this.username = username;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
