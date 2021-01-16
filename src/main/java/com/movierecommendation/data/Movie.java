package com.movierecommendation.data;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie {
    private String gerne;
    private String name;
    private String base64;

    public Movie() {
    }

    public Movie(String gerne, String name, String base64) {
        this.gerne = gerne;
        this.name = name;
        this.base64 = base64;
    }

    public String getGerne() {
        return gerne;
    }

    public void setGerne(String gerne) {
        this.gerne = gerne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }
}
