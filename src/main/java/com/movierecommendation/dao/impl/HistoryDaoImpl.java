package com.movierecommendation.dao.impl;

import com.movierecommendation.dao.HistoryDao;
import com.movierecommendation.data.History;
import com.movierecommendation.data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;

import java.util.List;

@Repository
public class HistoryDaoImpl implements HistoryDao {


    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void add(History history) {
        mongoTemplate.insert(history);
    }

    @Override
    public void addList(List<History> history) {
        mongoTemplate.insertAll(history);
    }

    @Override
    public List<History> getLast10ByUser(String user) {
        Query query = new Query(Criteria.where("username").is(user));
        Sort sort = Sort.by(Sort.Direction.DESC, "timestamp");
        query.with(sort);
        query.limit(10);
        return mongoTemplate.find(query,History.class);
    }
}
