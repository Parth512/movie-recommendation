package com.movierecommendation.data;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;


@Document
public class SignUp {

    private int id;

    private String username;

    private String email;

    private Set<String> role;

    private String password;

    private List<History> watchList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<History> getWatchList() {
        return watchList;
    }

    public void setWatchList(List<History> watchList) {
        this.watchList = watchList;
    }
}
