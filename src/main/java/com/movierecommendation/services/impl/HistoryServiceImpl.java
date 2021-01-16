package com.movierecommendation.services.impl;

import com.movierecommendation.dao.HistoryDao;
import com.movierecommendation.data.History;
import com.movierecommendation.data.Movie;
import com.movierecommendation.services.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    HistoryDao historyDao;

    @Override
    public void add(History history) {
        historyDao.add(history);
    }

    @Override
    public List<Movie> getLast10ByUser(String user) {
        List<History> histories = historyDao.getLast10ByUser(user);
        List<Movie> movies = new ArrayList<Movie>();
        histories.stream().forEach((entity) -> {
            movies.add(entity.getMovie());
        });
        return movies;
    }

    @Override
    public Set<String> recommendatedGerns(String user) {
        List<Movie> movies = getLast10ByUser(user);
        Map<String,Integer> recommendationMap = new HashMap<String, Integer>();
        movies.stream().forEach((entity) -> {
            if(recommendationMap.containsKey(entity.getGerne())) {
                int newValue = recommendationMap.get(entity.getGerne()) + 1;
                recommendationMap.put(entity.getGerne(),newValue);
            } else {
                recommendationMap.put(entity.getGerne(),1);
            }
        });

        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

        recommendationMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        return reverseSortedMap.keySet();
    }
}
