package com.movierecommendation.services;

import com.movierecommendation.data.History;
import com.movierecommendation.data.Movie;

import java.util.List;
import java.util.Set;

public interface HistoryService {

    /**
     * add history/watch
     * @param history
     */
    public void add(History history);

    /**
     * get last 10 watch/movvie seen by user
     * @param user
     * @return
     */
    public List<Movie> getLast10ByUser(String user);

    /**
     * get recommendated gerns
     * @param user
     * @return
     */
    public Set<String> recommendatedGerns(String user);

}
