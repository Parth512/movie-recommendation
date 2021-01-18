package com.movierecommendation.dao;

import com.movierecommendation.data.History;
import com.movierecommendation.data.Movie;

import java.util.List;

public interface HistoryDao {

    /**
     * Add history
     * @param history
     */
    public void  add(History history);

    /**
     * Add history list
     * @param history
     */
    public void  addList(List<History> history);

    /**
     * get last ten movies watched by given user
     * @param user
     */
    public List<History> getLast10ByUser(String user);


}
